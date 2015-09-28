package decorator;

public class Manager implements Project { 
	//实际上存放的是Employee对象 
	private Project project;        

    public Manager(Project project) { 
        this.project = project; 
    } 

    @Override
    public void doCoding() { 
        startNewWork(); 
    } 

    /** 
     * 模板：定义项目经理自己的事情 
     */ 
    public void startNewWork() { 
        doEarlyWork(); 
        //项目经理做完需求和设计后，直接将编码委派给Employee
        project.doCoding(); 
        //项目经理在做收尾工作 
        doEndWork(); 
    } 
 
    public void doEarlyWork() { 
    } 

    public void doEndWork() { 
    } 
}
