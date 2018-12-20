import java.io.UnsupportedEncodingException;

public class TextDocument extends CoreDocument{
    private Encoding encoding;
    private String text;

    public TextDocument(String s, Encoding e){
        text = s;
        encoding = e;
    }

    public int size() {
        switch(encoding){
            case UTF8:
                try{
                    final byte[] utf8Bytes = text.getBytes("UTF-8");
                    return utf8Bytes.length;
                } catch (UnsupportedEncodingException e){
                    e.printStackTrace();
                }
                break;
            case UTF16:
                try{
                    final byte[] utf16Bytes = text.getBytes("UTF-16");
                    return utf16Bytes.length;
                } catch (UnsupportedEncodingException e){
                    e.printStackTrace();
                }
                break;
            case UTF32:
                try{
                    final byte[] utf32Bytes = text.getBytes("UTF-32");
                    return utf32Bytes.length;
                } catch (UnsupportedEncodingException e){
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("Fehler");

        }
        return 0;
    }

}