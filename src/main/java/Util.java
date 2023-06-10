package main.java;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public abstract class Util {
	
	/**
     * Cambia de tamaño una imagen
     * @param width anchura de la nueva imagen
     * @param height altura de la nueva imagen
     * @param inputStream el stream de la imagen
     * @return un objeto de tipo {@link Image} con el nuevo tamaño asignado
     */
    public static Image resizeImage(int width, int height, InputStream inputStream) {
        Image img;

        try {
            img = ImageIO.read(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return img.getScaledInstance(width,height,Image.SCALE_SMOOTH);
    }

    /**
     * Obtienes el {@link InputStream} de algun archivo
     * @param path la ruta relativa del archivo
     * @return el {@link InputStream} del archivo
     */
    public static InputStream getStream(String path) {
        return Util.class.getClassLoader().getResourceAsStream(path);
    }
	
    public static byte[] getImageBytes(String path) {
    	if(path == null) {
    		return null;
    	}
    	
    	File imageFile = new File(path);
    	
    	byte[] imageBytes = new byte[(int) imageFile.length()];
    	try {
			InputStream is = new FileInputStream(imageFile);
			is.read(imageBytes);
			
			return imageBytes;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    }
    
    public static byte[] getImageBytes(InputStream inputStream) {
    	if(inputStream == null) {
    		return null;
    	}
    	
    	try {
			byte[] imageBytes = inputStreamToBytes(inputStream);
			
			return imageBytes;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    }
    
    private static byte[] inputStreamToBytes(InputStream inputStream) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        byte[] buffer = new byte[4096];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }

        return outputStream.toByteArray();
    }
    
}
