package org.lynna.cache;

/**
 * Created by kevinlynna on 25/06/2017.
 */
public interface CacheAPI {
    int writeData(Address addresses, byte[] bytes);
    int readData(Address addresses, byte[] bytes, int maxBitRead);
}
