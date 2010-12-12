package net.markguerra.android.glwallpaperexample;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import net.rbgrn.android.glwallpaperservice.*;
import android.opengl.GLU;

// Original code provided by Robert Green
// http://www.rbgrn.net/content/354-glsurfaceview-adapted-3d-live-wallpapers
public class MyRenderer implements GLWallpaperService.Renderer {
	GLTriangle mTriangle;

	public void onDrawFrame(GL10 gl) {
		gl.glClearColor(0.2f, 0.4f, 0.2f, 1f);
		gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
		
		gl.glMatrixMode(GL10.GL_MODELVIEW);
		autoRotate(gl);
		gl.glColor4f(.2f, 0f, .5f, 1f);
		mTriangle.draw(gl);
	}

	public void onSurfaceChanged(GL10 gl, int width, int height) {
		gl.glMatrixMode(GL10.GL_PROJECTION);
		gl.glLoadIdentity();
		GLU.gluPerspective(gl, 60f, (float)width/(float)height, 1f, 100f);

		gl.glMatrixMode(GL10.GL_MODELVIEW);
		gl.glLoadIdentity();
		gl.glTranslatef(0, 0, -5);
	}

	public void onSurfaceCreated(GL10 gl, EGLConfig config) {
		mTriangle = new GLTriangle();

		gl.glClearDepthf(1f);
		gl.glEnable(GL10.GL_DEPTH_TEST);
		gl.glDepthFunc(GL10.GL_LEQUAL);
	}

	/**
	 * Called when the engine is destroyed. Do any necessary clean up because
	 * at this point your renderer instance is now done for.
	 */
	public void release() {

	}

	private void autoRotate(GL10 gl) {
		gl.glRotatef(1, 0, 1, 0);
		gl.glRotatef(0.5f, 1, 0, 0);
	}
}
