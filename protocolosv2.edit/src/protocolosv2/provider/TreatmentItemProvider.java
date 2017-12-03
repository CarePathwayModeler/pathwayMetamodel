/**
 */
package protocolosv2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import protocolosv2.Protocolosv2Factory;
import protocolosv2.Protocolosv2Package;
import protocolosv2.Treatment;

/**
 * This is the item provider adapter for a {@link protocolosv2.Treatment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TreatmentItemProvider extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreatmentItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(Protocolosv2Package.Literals.TREATMENT__EXAMINATION);
			childrenFeatures.add(Protocolosv2Package.Literals.TREATMENT__MEDICATION);
			childrenFeatures.add(Protocolosv2Package.Literals.TREATMENT__ADMISSION);
			childrenFeatures.add(Protocolosv2Package.Literals.TREATMENT__PROCEDURE);
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
	 * This returns Treatment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Treatment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Treatment)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Treatment_type") :
			getString("_UI_Treatment_type") + " " + label;
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

		switch (notification.getFeatureID(Treatment.class)) {
			case Protocolosv2Package.TREATMENT__EXAMINATION:
			case Protocolosv2Package.TREATMENT__MEDICATION:
			case Protocolosv2Package.TREATMENT__ADMISSION:
			case Protocolosv2Package.TREATMENT__PROCEDURE:
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
				(Protocolosv2Package.Literals.TREATMENT__EXAMINATION,
				 Protocolosv2Factory.eINSTANCE.createExamination()));

		newChildDescriptors.add
			(createChildParameter
				(Protocolosv2Package.Literals.TREATMENT__MEDICATION,
				 Protocolosv2Factory.eINSTANCE.createMedication()));

		newChildDescriptors.add
			(createChildParameter
				(Protocolosv2Package.Literals.TREATMENT__ADMISSION,
				 Protocolosv2Factory.eINSTANCE.createAdmission()));

		newChildDescriptors.add
			(createChildParameter
				(Protocolosv2Package.Literals.TREATMENT__PROCEDURE,
				 Protocolosv2Factory.eINSTANCE.createProcedure()));
	}

}
