package me.tikiwong.PlantsVsZombies;

import com.sun.jna.Structure;

public class MODULEENTRY32 extends Structure {//�ṹ���࣬������Ϊһ���ɼ̳е��࣬���Ա���һһ��Ӧ
	public int dwSize = 1024;
	public int th32ModuleID;
	public int th32ProcessID;
	public int GlblcntUsage;
	public int ProccntUsage;
	public byte[] modBaseAddr = new byte[1];
	public int modBaseSize;
	public int hModule;
	public byte[] szModule = new byte[256];
	public byte[] szExePath = new byte[256];
	public int dwFlags;
}
//dwSize
//ָ���ṹ�ĳ��ȣ����ֽ�Ϊ��λ���ڵ���Module32First���ܣ����������ԱSIZEOF��MODULEENTRY32��������㲻��ʼ����dwSize��Module32First��ʧ�ܡ�
//th32ModuleID
//�˳�Ա�Ѿ����ٱ�ʹ�ã�ͨ��������Ϊ1
//th32ProcessID
//���ڼ��Ľ��̱�ʶ���������Ա�����ݣ�����ʹ��Win32 API��Ԫ��
//GlblcntUsage
//ȫ��ģ���ʹ�ü�������ģ��������������ͨ����һ����û������ģ�������Ϊ0xFFFF��
//ProccntUsage
//ȫ��ģ���ʹ�ü�������GlblcntUsage��ͬ����ͨ����һ��Ҳ��û������ģ�������Ϊ0xFFFF��
//modBaseAddr
//ģ��Ļ�ַ�����������Ľ��̷�Χ�ڡ�
//modBaseSize
//ģ��Ĵ�С����λ�ֽڡ�
//hModule
//�������̵ķ�Χ�ڣ�ģ������
//szModule
//NULL��β���ַ��������а���ģ������
//szExePath
//NULL��β���ַ��������а�����λ�ã���ģ���·����
