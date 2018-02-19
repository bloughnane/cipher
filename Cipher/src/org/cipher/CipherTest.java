package org.cipher;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CipherTest {
	Cipher cipher = new Cipher();

	@Test
	void testEncrypt() {
		Assertions.assertEquals("KHOOR", cipher.Encrypt("HELLO"));
	}
	
	@Test
	void testEncryptEdgeCase() {
		Assertions.assertEquals("ABC", cipher.Encrypt("XYZ"));
	}
	
	@Test
	void testDecrypt() {
		Assertions.assertEquals("HELLO", cipher.Decrypt("KHOOR"));
	}
	
	@Test
	void testDecryptEdgeCase() {
		Assertions.assertEquals("XYZ", cipher.Decrypt("ABC"));
	}

}
