package com.gleb.web.request;

import java.io.IOException;
import java.net.Socket;

public interface RequestParser {

    String parseFilePath(Socket socket) throws IOException;
}
