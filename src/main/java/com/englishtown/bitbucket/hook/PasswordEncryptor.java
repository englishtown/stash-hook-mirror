package com.englishtown.bitbucket.hook;

/**
 * Service to encrypt/decrypt git user passwords
 */
public interface PasswordEncryptor {

    /**
     * Checks whether the password is encrypted
     *
     * @param password the password to check
     * @return true if the password is encrypted
     */
    boolean isEncrypted(String password);

    /**
     * Encrypts the password if it is not already encrypted
     *
     * @param password the password to encrypt
     * @return encrypted password
     */
    String encrypt(String password);

    /**
     * Decrypts the password if it is encrypted
     *
     * @param password the encrypted password to decrypt
     * @return the decrypted password
     */
    String decrypt(String password);

}
