
package com.croma.pdfviewer.source;

import android.content.Context;

import com.croma.pdfviewer.util.Util;
import com.croma.pdfhelper.PdfDocument;
import com.croma.pdfhelper.PdfiumCore;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamSource implements DocumentSource {

    private InputStream inputStream;

    public InputStreamSource(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public PdfDocument createDocument(Context context, PdfiumCore core, String password) throws IOException {
        return core.newDocument(Util.toByteArray(inputStream), password);
    }
}
