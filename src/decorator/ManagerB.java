package decorator;

public class ManagerB extends Manager { 

    public ManagerB(Project project) { 
        super(project); 
    } 

    public void doEarlyWork() { 
        System.out.println("��Ŀ����B �����������"); 
        System.out.println("��Ŀ����B ������ϸ���"); 
    } 

    public void doEndWork() { 
        System.out.println("��Ŀ����B ������β����"); 
    } 
}