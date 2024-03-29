package net.abi.abisEngine.components;

import net.abi.abisEngine.core.Entity;
import net.abi.abisEngine.math.Transform;
import net.abi.abisEngine.rendering.RenderingEngine;
import net.abi.abisEngine.rendering.sceneManagement.Scene;
import net.abi.abisEngine.rendering.shaders.Shader;

public abstract class SceneComponent {

	private Entity parent;
	private String Name;

	public Transform getTransform() {
		return parent.getTransform();
	}

	public Scene getParentScene() {
		return parent.getParentScene();
	}

	public Entity getParent() {
		return parent;
	}

	public void setParent(Entity parent) {
		this.parent = parent;
	}

	public void init() {
	}

	public void update(float delta) {
	}

	public void input(float delta) {
	}

	public void render(Shader shader, RenderingEngine engine) {
	}

	public void addToScene() {

	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}