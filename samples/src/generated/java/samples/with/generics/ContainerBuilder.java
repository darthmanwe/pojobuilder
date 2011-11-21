package samples.with.generics;



import samples.with.generics.Item;
import samples.with.generics.Container;
import java.io.Serializable;


/**
 * The {@link ContainerBuilder} is a Builder for {@link Container} objects.
 *
 * @created  by the PojoBuilder generator
 */
public class ContainerBuilder<T extends Item & Serializable> implements Cloneable {

	protected T value$element$T; 
	protected boolean isSet$element$T = false; 



	/**
	 * Creates a new {@link ContainerBuilder}.
	 */
	public ContainerBuilder() {
	}

	/**
	 * Sets the default value for the {@link Container#element} property.
	 * @param value the default value
	 * @return this builder
	 */
	public ContainerBuilder<T> withElement( T value) {
		this.value$element$T = value;
		this.isSet$element$T = true;
		return this;
	}


	/**
	 * Returns a clone of this builder.
	 * @return the clone
	 */
	@Override	
	public Object clone() {
		try {
			Object result = super.clone();
			return result;
		} catch (CloneNotSupportedException e) {
			throw new InternalError(e.getMessage());
		}        
	}

	/**
	 * Returns a clone of this builder.
	 * @return the clone
	 */
	@SuppressWarnings("unchecked")
	public ContainerBuilder<T> but() {
		return (ContainerBuilder<T>)clone();
	}

	/**
	 * Creates a new {@link Container} based on this builders settings.
	 * @return the created Container
	 */
	public Container<T> build() {
		Container<T> result = new Container<T>( );
		if ( this.isSet$element$T) {    
			result.setElement( this.value$element$T);		
		}

		return result;
	}

}