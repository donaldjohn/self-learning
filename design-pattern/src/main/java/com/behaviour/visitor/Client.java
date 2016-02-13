package com.behaviour.visitor;

/*
 * node����visitor�ķ������һ����̬���ɣ������Լ�����vistor����vistor�����һ����̬�ַ���
 */
public class Client {

    public static void main(String[] args) {
        //����һ���ṹ����
        ObjectStructure os = new ObjectStructure();
        //���ṹ����һ���ڵ�
        os.add(new NodeA());
        //���ṹ����һ���ڵ�
        os.add(new NodeB());
        //����һ��������
        Visitor visitor = new VisitorA();
        os.action(visitor);
    }

}