package com.base.engine.components;

import com.base.engine.math.Vector3f;
import com.base.engine.rendering.shaders.Shader;

public class Light extends SceneComponent {

	private Vector3f color;
	private float intensity;
	private Shader shader;

	public Light(Vector3f color, float intensity) {
		this.color = color;
		this.intensity = intensity;
		
	}

	public Shader getShader() {
		return shader;
	}

	@Override
	public void addToScene() {
		super.getParentScene().addLight(this);
	}

	public void setShader(Shader shader) {
		this.shader = shader;
	}

	public Vector3f getColor() {
		return color;
	}

	public float getIntensity() {
		return intensity;
	}

	public void setColor(Vector3f color) {
		this.color = color;
	}

	public void setIntensity(float intensity) {
		this.intensity = intensity;
	}

}