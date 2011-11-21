package samples.with.generics;



import samples.with.generics.Order2;
import java.util.List;
import samples.with.generics.Item;
import java.io.Serializable;


/**
 * The {@link Order2Builder} is a Builder for {@link Order2} objects.
 *
 * @created  by the PojoBuilder generator
 */
public class Order2Builder<T extends Item & Serializable> implements Cloneable {

	protected String value$customer$java$lang$String; 
	protected boolean isSet$customer$java$lang$String = false; 

	protected List<T> value$items$java$util$List; 
	protected boolean isSet$items$java$util$List = false; 



	/**
	 * Creates a new {@link Order2Builder}.
	 */
	public Order2Builder() {
	}

	/**
	 * Sets the default value for the {@link Order2#customer} property.
	 * @param value the default value
	 * @return this builder
	 */
	public Order2Builder<T> withCustomer( String value) {
		this.value$customer$java$lang$String = value;
		this.isSet$customer$java$lang$String = true;
		return this;
	}
	/**
	 * Sets the default value for the {@link Order2#items} property.
	 * @param value the default value
	 * @return this builder
	 */
	public Order2Builder<T> withItems( List<T> value) {
		this.value$items$java$util$List = value;
		this.isSet$items$java$util$List = true;
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
	public Order2Builder<T> but() {
		return (Order2Builder<T>)clone();
	}

	/**
	 * Creates a new {@link Order2} based on this builders settings.
	 * @return the created Order2
	 */
	public Order2<T> build() {
		Order2<T> result = new Order2<T>( );
		if ( this.isSet$customer$java$lang$String) {    
			result.setCustomer( this.value$customer$java$lang$String);		
		}
		if ( this.isSet$items$java$util$List) {    
			result.setItems( this.value$items$java$util$List);		
		}

		return result;
	}

}