package Engine;

import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;

public class Camera {
	private Vector3D pos;
	private Vector3D lookintAt;
	
	public Vector3D getPos() {
		return pos;
	}
	public void setPos(Vector3D pos) {
		this.pos = pos;
	}
	public Vector3D getLookintAt() {
		return lookintAt;
	}
	public void setLookintAt(Vector3D lookintAt) {
		this.lookintAt = lookintAt;
	}
}
