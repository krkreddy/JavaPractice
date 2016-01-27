package dataStructures;

public class DelimitorMatchingStack {
	
	public static void main(String args[]){
		DelimitorMatchingStack dms = new DelimitorMatchingStack();
		String expression;
		expression = "{(a+b)*(c+d)}";
		System.out.println("--> "+expression+" = "+dms.isDelimitorMaching(expression));
		expression = "{(a+b)+[x*(c+d)]}";
		System.out.println("--> "+expression+" = "+dms.isDelimitorMaching(expression));
		expression = "{(a+b)+[x*(c+d)}}";
		System.out.println("--> "+expression+" = "+dms.isDelimitorMaching(expression));
	}
	
	public boolean isDelimitorMaching(String expression){
		StackImplement si = new StackImplement(expression);
		char observation;
		for(int i=0;i<expression.length();i++){
			observation = expression.charAt(i);
			switch(observation){
			case '{':
			case '[':
			case '(':
				si.push(observation);
				System.out.println(observation+" is pushed in");
				break;
			case '}':
			case ']':
			case ')':
				if(si.isEmpty()){
					System.out.println("Stack got empty before finding closing bracket "+observation);
					return false;
				}
				else{
					if(observation == '}' && si.peek() == '{'){
						si.pop();
						System.out.println("{ is poped out");
					}
					else if(observation == ']' && si.peek() == '['){
						si.pop();
						System.out.println("[ is poped out");
					}
					else if(observation == ')' && si.peek() == '('){
						si.pop();
						System.out.println("( is poped out");
					}
					else{
						System.out.println("-- X -- Mismatch found for '"+observation+"'");
						return false;
					}
					//System.out.println(expression.substring(i+1)+" "+si.peek()+" "+observation);
				}
				break;
			default: break;	
			}
		}
		return true;
	}

}

class StackImplement{
	
	private char[] charArr;
	private int top;
	
	public StackImplement(String input){
		this.charArr = new char[input.length()];
		this.top = -1;
	}
	
	public boolean isEmpty(){
		//System.out.println(top);
		return (top == -1);
	}
	
	public boolean isFull(){
		return (top == charArr.length-1);
	}
	
	public void push(char symbol){
		charArr[++top] = symbol;
	}
	
	public char pop(){
		char entry = charArr[top--];
		return entry;
	}
	
	public char peek(){
		return charArr[top];
	}
}
