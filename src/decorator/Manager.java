package decorator;

public class Manager implements Project { 
	//ʵ���ϴ�ŵ���Employee���� 
	private Project project;        

    public Manager(Project project) { 
        this.project = project; 
    } 

    @Override
    public void doCoding() { 
        startNewWork(); 
    } 

    /** 
     * ģ�壺������Ŀ�����Լ������� 
     */ 
    public void startNewWork() { 
        doEarlyWork(); 
        //��Ŀ���������������ƺ�ֱ�ӽ�����ί�ɸ�Employee
        project.doCoding(); 
        //��Ŀ����������β���� 
        doEndWork(); 
    } 
 
    public void doEarlyWork() { 
    } 

    public void doEndWork() { 
    } 
}
