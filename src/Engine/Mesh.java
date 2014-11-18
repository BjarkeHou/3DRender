package Engine;

import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;

public class Mesh {
	private String name;
	private Vector3D[] vertices;
	private Vector3D pos;
	private Vector3D rotation;
	
	public Mesh(String name, Vector3D[] vertices) {
		this.name = name;
		this.vertices = vertices;
	}
	
	public Mesh(String name, Vector3D[] vertices, Vector3D pos, Vector3D rotation) {
		this.name = name;
		this.vertices = vertices;
		this.pos = pos;
		this.rotation = rotation;
	}

	public Vector3D getPos() {
		return pos;
	}

	public void setPos(Vector3D pos) {
		this.pos = pos;
	}

	public Vector3D getRotation() {
		return rotation;
	}

	public void setRotation(Vector3D rotation) {
		this.rotation = rotation;
	}

	public String getName() {
		return name;
	}
	
	public Vector3D[] getVertices() {
		return vertices;
	}
}
