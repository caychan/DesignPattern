package decorator;

public class Main { 
    public static void main(String args[]) { 
        Project employee = new Employee();        //���빤�� 
        Project managerA = new ManagerA(employee); //��Ŀ���� 
        Project managerB = new ManagerB(employee); //��Ŀ���� 
     
        //�Ծ�������彫������ɣ����Ͷ��Ǿ���ģ�ʵ�ʱ�����ǹ��� 
        managerA.doCoding(); 
        managerB.doCoding(); 
    } 
}