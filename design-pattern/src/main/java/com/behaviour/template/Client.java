package com.behaviour.template;

/*
 * servlet����ģ��ģʽ��Ӧ�ã���ֻ��һ��service()ģ�巽��
 */
public class Client {

    public static void main(String[] args) {
        Account account = new MoneyMarketAccount();
        System.out.println("�����г��˺ŵ���Ϣ����Ϊ��" + account.calculateInterest());
        account = new CDAccount();
        System.out.println("�����˺ŵ���Ϣ����Ϊ��" + account.calculateInterest());
    }

}