package template;

public abstract class Template {
	private void beforeOprate(){
		System.out.println("this action happens before oprate");
	}

	private void afterOprate(){
		System.out.println("this action happens after oprate");
	}
	
	protected abstract void doOprate();
	
	public void oprate(){
		beforeOprate();
		doOprate();
		afterOprate();
	}
	
}
