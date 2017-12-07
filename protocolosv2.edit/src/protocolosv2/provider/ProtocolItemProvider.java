/**
 */
package protocolosv2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import protocolosv2.Protocol;
import protocolosv2.Protocolosv2Factory;
import protocolosv2.Protocolosv2Package;

/**
 * This is the item provider adapter for a {@link protocolosv2.Protocol} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProtocolItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addUrlPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addCodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Protocol_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Protocol_id_feature", "_UI_Protocol_type"),
				 Protocolosv2Package.Literals.PROTOCOL__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Protocol_url_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Protocol_url_feature", "_UI_Protocol_type"),
				 Protocolosv2Package.Literals.PROTOCOL__URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Protocol_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Protocol_name_feature", "_UI_Protocol_type"),
				 Protocolosv2Package.Literals.PROTOCOL__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Protocol_code_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Protocol_code_feature", "_UI_Protocol_type"),
				 Protocolosv2Package.Literals.PROTOCOL__CODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Protocolosv2Package.Literals.PROTOCOL__ELEMENTO);
			childrenFeatures.add(Protocolosv2Package.Literals.PROTOCOL__SEQUENCE);
			childrenFeatures.add(Protocolosv2Package.Literals.PROTOCOL__CATEGORY);
			childrenFeatures.add(Protocolosv2Package.Literals.PROTOCOL__OPERATION);
			childrenFeatures.add(Protocolosv2Package.Literals.PROTOCOL__VARIABLE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Protocol.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Protocol"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Protocol)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Protocol_type") :
			getString("_UI_Protocol_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Protocol.class)) {
			case Protocolosv2Package.PROTOCOL__ID:
			case Protocolosv2Package.PROTOCOL__URL:
			case Protocolosv2Package.PROTOCOL__NAME:
			case Protocolosv2Package.PROTOCOL__CODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Protocolosv2Package.PROTOCOL__ELEMENTO:
			case Protocolosv2Package.PROTOCOL__SEQUENCE:
			case Protocolosv2Package.PROTOCOL__CATEGORY:
			case Protocolosv2Package.PROTOCOL__OPERATION:
			case Protocolosv2Package.PROTOCOL__VARIABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Protocolosv2Package.Literals.PROTOCOL__ELEMENTO,
				 Protocolosv2Factory.eINSTANCE.createAuxiliaryConduct()));

		newChildDescriptors.add
			(createChildParameter
				(Protocolosv2Package.Literals.PROTOCOL__ELEMENTO,
				 Protocolosv2Factory.eINSTANCE.createPrescription()));

		newChildDescriptors.add
			(createChildParameter
				(Protocolosv2Package.Literals.PROTOCOL__ELEMENTO,
				 Protocolosv2Factory.eINSTANCE.createDischarge()));

		newChildDescriptors.add
			(createChildParameter
				(Protocolosv2Package.Literals.PROTOCOL__ELEMENTO,
				 Protocolosv2Factory.eINSTANCE.createReferral()));

		newChildDescriptors.add
			(createChildParameter
				(Protocolosv2Package.Literals.PROTOCOL__ELEMENTO,
				 Protocolosv2Factory.eINSTANCE.createTreatment()));

		newChildDescriptors.add
			(createChildParameter
				(Protocolosv2Package.Literals.PROTOCOL__ELEMENTO,
				 Protocolosv2Factory.eINSTANCE.createInformation()));

		newChildDescriptors.add
			(createChildParameter
				(Protocolosv2Package.Literals.PROTOCOL__SEQUENCE,
				 Protocolosv2Factory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(Protocolosv2Package.Literals.PROTOCOL__CATEGORY,
				 Protocolosv2Factory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(Protocolosv2Package.Literals.PROTOCOL__OPERATION,
				 Protocolosv2Factory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(Protocolosv2Package.Literals.PROTOCOL__VARIABLE,
				 Protocolosv2Factory.eINSTANCE.createNumeric()));

		newChildDescriptors.add
			(createChildParameter
				(Protocolosv2Package.Literals.PROTOCOL__VARIABLE,
				 Protocolosv2Factory.eINSTANCE.createYesOrNo()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Protocolosv2EditPlugin.INSTANCE;
	}

}
