package mixin;

public interface SwitchableView extends Switchable {

	Switchable getSwitchable();

	default boolean isActive() {
		return getSwitchable().isActive();
	}

	default void setActive(boolean active) {
		getSwitchable().setActive(active);
	}
}