package murach.test;

public interface Displayable {
    default String getDisplayText() {
    	return this.toString();
    };
}
