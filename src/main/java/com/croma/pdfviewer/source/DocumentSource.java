
package com.croma.pdfviewer.source;

import android.content.Context;

import com.croma.pdfhelper.PdfDocument;
import com.croma.pdfhelper.PdfiumCore;

import java.io.IOException;

public interface DocumentSource {
    PdfDocument createDocument(Context context, PdfiumCore core, String password) throws IOException;
}
