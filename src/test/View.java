package test;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

public class View extends ViewPart {
	public View() {
	}
	public static final String ID = "test.view";

	private TableViewer viewer;
	private Text text;
	private Text text_1;
	private Table table_1;
	
	/**
	 * The content provider class is responsible for providing objects to the
	 * view. It can wrap existing objects in adapters or simply return objects
	 * as-is. These objects may be sensitive to the current input of the view,
	 * or ignore it and always show the same content (like Task List, for
	 * example).
	 */
	class ViewContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}

		public void dispose() {
		}

		public Object[] getElements(Object parent) {
			if (parent instanceof Object[]) {
				return (Object[]) parent;
			}
	        return new Object[0];
		}
	}

	class ViewLabelProvider extends LabelProvider implements
			ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}

		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(
					ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		
		FormLayout formLayout = new FormLayout();

	     parent.setLayout(formLayout);
	     
	     Composite composite = new Composite(parent, SWT.NONE);
	     FormData fd_composite = new FormData();
	     fd_composite.right = new FormAttachment(100, -201);
	     fd_composite.left = new FormAttachment(0, 29);
	     fd_composite.top = new FormAttachment(0, 29);
	     fd_composite.bottom = new FormAttachment(0, 309);
	     composite.setLayoutData(fd_composite);
	     
	     ImageDescriptor imageDescriptor = Activator.getImageDescriptor("/icons/groups.gif");
	     composite.setBackgroundImage(imageDescriptor.createImage());
	     
	     Composite composite_1 = new Composite(parent, SWT.NONE);
	     FormData fd_composite_1 = new FormData();
	     fd_composite_1.bottom = new FormAttachment(100, -24);
	     fd_composite_1.left = new FormAttachment(0, 29);
	     fd_composite_1.top = new FormAttachment(100, -91);
	     fd_composite_1.right = new FormAttachment(0, 393);
	     composite_1.setLayoutData(fd_composite_1);
	     
	     Label label = new Label(composite_1, SWT.NONE);
	     label.setBounds(10, 10, 36, 15);
	     label.setText("\u670D\u52A1\u5668");
	     
	     Combo combo = new Combo(composite_1, SWT.NONE);
	     combo.setBounds(57, 2, 233, 23);
	     
	     Label label_1 = new Label(composite_1, SWT.NONE);
	     label_1.setBounds(10, 42, 36, 15);
	     label_1.setText("\u7528\u6237\u540D");
	     
	     text = new Text(composite_1, SWT.BORDER);
	     text.setBounds(57, 36, 102, 21);
	     
	     Label label_2 = new Label(composite_1, SWT.NONE);
	     label_2.setBounds(184, 42, 24, 15);
	     label_2.setText("\u5BC6\u7801");
	     
	     text_1 = new Text(composite_1, SWT.BORDER);
	     text_1.setBounds(217, 36, 73, 21);
	     
	     Button button = new Button(composite_1, SWT.NONE);
	     button.setBounds(316, 5, 48, 25);
	     button.setText("\u6DFB\u52A0");
	     
	     Button button_1 = new Button(composite_1, SWT.NONE);
	     button_1.setBounds(316, 37, 48, 25);
	     button_1.setText("\u767B\u9646");
	     
	        table_1 = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
			FormData fd_table_1 = new FormData();
			fd_table_1.right = new FormAttachment(composite_1, 175, SWT.RIGHT);
			fd_table_1.top = new FormAttachment(0, 24);
			fd_table_1.bottom = new FormAttachment(100, -24);
			fd_table_1.left = new FormAttachment(composite_1, 16);
			table_1.setLayoutData(fd_table_1);
			table_1.setHeaderVisible(true);
			table_1.setLinesVisible(true);
			
			TableColumn tableColumn = new TableColumn(table_1, SWT.NONE);
			tableColumn.setWidth(100);
			tableColumn.setText("\u5185\u5BB9");
			
			TableColumn tableColumn_1 = new TableColumn(table_1, SWT.NONE);
			tableColumn_1.setWidth(69);
			tableColumn_1.setText("\u64CD\u4F5C");
			
			TableItem tableItem = new TableItem(table_1, SWT.NONE);
			tableItem.setText("New TableItem");
			
			TableItem tableItem_1 = new TableItem(table_1, SWT.NONE);
			tableItem_1.setText("New TableItem");
			
			TableItem tableItem_2 = new TableItem(table_1, SWT.NONE);
			tableItem_2.setText("New TableItem");
			
			TableItem tableItem_3 = new TableItem(table_1, SWT.NONE);
			tableItem_3.setText("New TableItem");
			
			TableItem tableItem_4 = new TableItem(table_1, SWT.NONE);
			tableItem_4.setText("New TableItem");
			
			TableItem tableItem_5 = new TableItem(table_1, SWT.NONE);
			tableItem_5.setText("New TableItem");
			
			TableItem tableItem_6 = new TableItem(table_1, 0);
			tableItem_6.setText("New TableItem");
			
			TableItem tableItem_7 = new TableItem(table_1, 0);
			tableItem_7.setText("New TableItem");
			
			TableItem tableItem_8 = new TableItem(table_1, 0);
			tableItem_8.setText("New TableItem");
			
			TableItem tableItem_9 = new TableItem(table_1, 0);
			tableItem_9.setText("New TableItem");
	     
	     
	     
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		//viewer.getControl().setFocus();
	}
}