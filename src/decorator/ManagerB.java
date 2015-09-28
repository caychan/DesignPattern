package decorator;

public class ManagerB extends Manager { 

    public ManagerB(Project project) { 
        super(project); 
    } 

    public void doEarlyWork() { 
        System.out.println("项目经理B 在做需求分析"); 
        System.out.println("项目经理B 在做详细设计"); 
    } 

    public void doEndWork() { 
        System.out.println("项目经理B 在做收尾工作"); 
    } 
}