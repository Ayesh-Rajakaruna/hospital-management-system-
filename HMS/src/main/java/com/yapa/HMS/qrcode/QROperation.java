package com.yapa.HMS.qrcode;

import com.google.zxing.WriterException;

import java.io.IOException;

public interface QROperation {
    void createQR(String data, String path, String charset, int i, int i1) throws WriterException, IOException;
}
