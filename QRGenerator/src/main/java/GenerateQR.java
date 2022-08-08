import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.IOException;
import java.nio.file.Paths;

public class GenerateQR {
    public static void main(String[] args) throws IOException, WriterException {

        String data="www.wikipedia.com";
        String path="C:\\Users\\Shri\\Pictures\\QR's\\code.jpg";
        BitMatrix matrix=new MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE,500,500);

        MatrixToImageWriter.writeToPath(matrix,"jpg", Paths.get(path));
        System.out.println("QR generated");
    }
}
