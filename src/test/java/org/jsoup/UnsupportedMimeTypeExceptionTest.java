package org.jsoup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UnsupportedMimeTypeExceptionTest {

    @Test
    public void testToString() {
        UnsupportedMimeTypeException exception = new UnsupportedMimeTypeException("Unsupported MIME type", "application/unsupported", "http://example.com");
        assertTrue(exception.toString().contains("Unsupported MIME type"));
        assertTrue(exception.toString().contains("application/unsupported"));
        assertTrue(exception.toString().contains("http://example.com"));
    }

    @Test
    public void testGetMimeType() {
        UnsupportedMimeTypeException exception = new UnsupportedMimeTypeException("Unsupported MIME type", "application/unsupported", "http://example.com");
        assertEquals("application/unsupported", exception.getMimeType());
    }

    @Test
    public void testGetUrl() {
        UnsupportedMimeTypeException exception = new UnsupportedMimeTypeException("Unsupported MIME type", "application/unsupported", "http://example.com");
        assertEquals("http://example.com", exception.getUrl());
    }
}