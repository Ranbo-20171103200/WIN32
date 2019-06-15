package me.tikiwong.PlantsVsZombies;

import com.sun.jna.Structure;

public class MODULEENTRY32 extends Structure {//结构体类，被看作为一个可继承的类，属性必须一一对应
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
//指定结构的长度，以字节为单位。在调用Module32First功能，设置这个成员SIZEOF（MODULEENTRY32）。如果你不初始化的dwSize，Module32First将失败。
//th32ModuleID
//此成员已经不再被使用，通常被设置为1
//th32ProcessID
//正在检查的进程标识符。这个成员的内容，可以使用Win32 API的元素
//GlblcntUsage
//全局模块的使用计数，即模块的总载入次数。通常这一项是没有意义的，被设置为0xFFFF。
//ProccntUsage
//全局模块的使用计数（与GlblcntUsage相同）。通常这一项也是没有意义的，被设置为0xFFFF。
//modBaseAddr
//模块的基址，在其所属的进程范围内。
//modBaseSize
//模块的大小，单位字节。
//hModule
//所属进程的范围内，模块句柄。
//szModule
//NULL结尾的字符串，其中包含模块名。
//szExePath
//NULL结尾的字符串，其中包含的位置，或模块的路径。
