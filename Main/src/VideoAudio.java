package src;


import com.xuggle.mediatool.IMediaReader;
import com.xuggle.mediatool.IMediaWriter;
import com.xuggle.mediatool.ToolFactory;
import com.xuggle.xuggler.ICodec;

public class VideoAudio {
    public static void main(String[] args){

        String absolutePath = args[0];
        String outputExtension = args[1];
        String[] inputExtension = absolutePath.split("\\.");
        String outputPath = "";

        for (int i=0; i< inputExtension.length-1; i++) {
            outputPath += inputExtension[i];
        }


        IMediaReader reader = ToolFactory.makeReader("F:/input.mkv"); // открываемый медиафайл
        IMediaWriter writer = ToolFactory.makeWriter("F:/output.mp3", reader); // записываемый аудиофайл
        int sampleRate = 44100; //
        int channels = 1;
        writer.addAudioStream(0, 0, ICodec.ID.CODEC_ID_MP3, channels, sampleRate);
        while (reader.readPacket() == null) {}
    }

}