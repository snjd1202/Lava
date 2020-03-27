package day15;

import java.util.regex.*;

import javax.swing.*;

/*
 	¹®Á¦ 1]
 	
 		ÀÌ¸ŞÀÏÀ» ÀÔ·Â¹Ş¾Æ¼­
 		ÀÔ·Â¹ŞÀº ¹®ÀÚ¿­ÀÌ ÀÌ¸ŞÀÏ Çü½Ä¿¡ ¸Â´ÂÁö ¾Æ´ÑÁö °Ë»çÇÏ¼¼¿ä.
 		ÀÌ¸ŞÀÏ Çü½ÄÀº
 			¾ËÆÄºª°ú ¼ıÀÚ·Î 8±ÛÀÚ ÀÌ»óÀ¸·Î ÇÏ°í @ µµ¸ŞÀÎÁÖ¼Ò
 		·Î Ã³¸®ÇÏ¼¼¿ä.
 			
 		Âü°í]
 			ÇÑ±Û Ã³¸® : [°¡-ÆR] 
 		
 */
public class Ex01 {
	public Ex01(){
		// ÀüÈ­¹øÈ£ ÀÔ·Â¹Ş±â
		String mail = JOptionPane.showInputDialog("ÀÌ¸ŞÀÏÀ» ÀÔ·ÂÇÏ¼¼¿ä.");
		// ÆĞÅÏ ¸¸µé±â
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{8,}@[a-zA-Z0-9].*");
		Matcher match = pattern.matcher(mail);
		// °Ë»ç°á°ú
		if(match.matches()) {
			JOptionPane.showMessageDialog(null, "¿Ã¹Ù¸¥ ÀÌ¸ŞÀÏ Çü½ÄÀÔ´Ï´Ù.");
		} else {
			JOptionPane.showMessageDialog(null, "¿Ã¹Ù¸£Áö ¾ÊÀº ÀÌ¸ŞÀÏ Çü½ÄÀÔ´Ï´Ù.");			
		}
	}
	public static void main(String[] args) {
		new Ex01();
	}

}
