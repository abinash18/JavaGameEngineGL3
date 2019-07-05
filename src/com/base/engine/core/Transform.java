package com.base.engine.core;

import com.base.engine.rendering.Matrix4f;

public class Transform {

	// private static Camera cam;
	private static float zNear, zFar, width, height, fov;
	private Vector3f position, scale;
	private Quaternion rotation;

	public Transform() {
		this.position = new Vector3f(0, 0, 0);
		this.rotation = new Quaternion(0, 0, 0, 1);
		this.scale = new Vector3f(1, 1, 1);

	}

	public Matrix4f getTransformation() {

		Matrix4f translationMatrix = new Matrix4f().initTranslation(position.getX(), position.getY(), position.getZ());
		Matrix4f rotationMatrix = rotation.toRotationMatrix();
		Matrix4f scaleMatrix = new Matrix4f().initScale(scale.getX(), scale.getY(), scale.getZ());

		return translationMatrix.mul(rotationMatrix.mul(scaleMatrix));
	}

	public Vector3f getPosition() {
		return position;
	}

	public void setPosition(Vector3f translation) {
		this.position = translation;
	}

	public void setTranslation(float x, float y, float z) {
		this.position = new Vector3f(x, y, z);
	}

	public Quaternion getRotation() {
		return rotation;
	}

	public void setRotation(Quaternion rotation) {
		this.rotation = rotation;
	}

	public void setRotation(float x, float y, float z, float w) {
		this.rotation = new Quaternion(x, y, z, w);
	}

	public Vector3f getScale() {
		return scale;
	}

	public void setScale(Vector3f scale) {
		this.scale = (scale);
	}

	public void setScale(float x, float y, float z) {
		this.scale = new Vector3f(x, y, z);
	}

//	public static Camera getCam() {
//		return cam;
//	}
//
//	public static void setCam(Camera cam) {
//		Transform.cam = cam;
//	}

	public static float getzNear() {
		return zNear;
	}

	public static void setzNear(float zNear) {
		Transform.zNear = zNear;
	}

	public static float getzFar() {
		return zFar;
	}

	public static void setzFar(float zFar) {
		Transform.zFar = zFar;
	}

	public static float getWidth() {
		return width;
	}

	public static void setWidth(float width) {
		Transform.width = width;
	}

	public static float getHeight() {
		return height;
	}

	public static void setHeight(float height) {
		Transform.height = height;
	}

	public static float getFov() {
		return fov;
	}

	public static void setFov(float fov) {
		Transform.fov = fov;
	}
}
