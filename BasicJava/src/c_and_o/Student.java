package c_and_o;

public class Student {
	int id;
	String name;
	int score;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}

/*
The real point of getters and setters is that you should only use them where they are appropriate, and 
that they can do more than just get and set fields.

You can have only a getter. Then the property is read only. This should actually be the most common case.
You can have only a setter, making the property configurable, but communicating that nothing else 
should depend on its value
A getter can compute a value from several fields rather than return one field.
A getter can make a defensive copy
A getter can perform an expensive fetch operation lazily and use a field to cache the value
A setter can do sanity checks and throw IllegalArgumentException
A setter can notify listeners of changes to the value

You can have a setter that sets multiple fields together because they belong together conceptually. 
This doesn't adhere to the JavaBeans specification, so don't do it if you depend on frameworks or 
tools that expect JavaBeans. Otherwise, it's a useful option.
 */
