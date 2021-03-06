package io.github.howiefh.generator.ui;

import io.github.howiefh.generator.common.enums.DBType;
import io.github.howiefh.generator.ui.handle.SelectFileHandler;
import io.github.howiefh.generator.ui.model.ConfigModel;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.swingbinding.SwingBindings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * @author fenghao
 * @version 1.0
 * @since 1.0
 */
public class BaseConfigPanel extends JPanel {
    private static final long serialVersionUID = -2934739600494831543L;
    private SelectFileHandler  selectFileHandler;
    // Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel authorLabel;
    private JTextField authorTextField;
    private JLabel versionLabel;
    private JTextField versionTextField;
    private JLabel sinceLabel;
    private JTextField sinceTextField;
    private JLabel templateDirLabel;
    private JTextField templateDirTextField;
    private JButton selectFileButton;
    private JLabel databaseLabel;
    private JComboBox databaseTextField;
    private JLabel jdbcDriverLabel;
    private JTextField jdbcDriverTextField;
    private JLabel jdbcUrlLabel;
    private JTextField jdbcUrlTextField;
    private JLabel jdbcUsernameLabel;
    private JTextField jdbcUsernameTextField;
    private JLabel jdbcPasswordLabel;
    private JTextField jdbcPasswordTextField;
    private ConfigModel configModel;
    private List dbTypes;
    private BindingGroup bindingGroup;
    // End of variables declaration  //GEN-END:variables

    public BaseConfigPanel() {
        dbTypes = new ArrayList();
        for (DBType dbType: DBType.values()){
            dbTypes.add(dbType.getCode());
        }

        initComponents();

        selectFileHandler = new SelectFileHandler(templateDirTextField);
    }

    private void selectFileActionPerformed(ActionEvent e) {
        selectFileHandler.handleSelectFile();
    }

    private void initComponents() {
        // Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        ResourceBundle bundle = ResourceBundle.getBundle("lang.language");
        authorLabel = new JLabel();
        authorTextField = new JTextField();
        versionLabel = new JLabel();
        versionTextField = new JTextField();
        sinceLabel = new JLabel();
        sinceTextField = new JTextField();
        templateDirLabel = new JLabel();
        templateDirTextField = new JTextField();
        selectFileButton = new JButton();
        databaseLabel = new JLabel();
        databaseTextField = new JComboBox();
        jdbcDriverLabel = new JLabel();
        jdbcDriverTextField = new JTextField();
        jdbcUrlLabel = new JLabel();
        jdbcUrlTextField = new JTextField();
        jdbcUsernameLabel = new JLabel();
        jdbcUsernameTextField = new JTextField();
        jdbcPasswordLabel = new JLabel();
        jdbcPasswordTextField = new JTextField();
        configModel = new ConfigModel();

        //======== this ========
        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0E-4};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0E-4};

        //---- authorLabel ----
        authorLabel.setText(bundle.getString("BaseConfigPanel.authorLabel.text"));
        add(authorLabel, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        add(authorTextField, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- versionLabel ----
        versionLabel.setText(bundle.getString("BaseConfigPanel.versionLabel.text"));
        add(versionLabel, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        add(versionTextField, new GridBagConstraints(3, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- sinceLabel ----
        sinceLabel.setText(bundle.getString("BaseConfigPanel.sinceLabel.text"));
        add(sinceLabel, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        add(sinceTextField, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- templateDirLabel ----
        templateDirLabel.setText(bundle.getString("BaseConfigPanel.templateDirLabel.text"));
        add(templateDirLabel, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        add(templateDirTextField, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- selectFileButton ----
        selectFileButton.setText(bundle.getString("BaseConfigPanel.selectFileButton.text"));
        selectFileButton.setToolTipText(bundle.getString("BaseConfigPanel.selectFileButton.toolTipText"));
        selectFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectFileActionPerformed(e);
            }
        });
        add(selectFileButton, new GridBagConstraints(4, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- databaseLabel ----
        databaseLabel.setText(bundle.getString("BaseConfigPanel.databaseLabel.text"));
        add(databaseLabel, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        add(databaseTextField, new GridBagConstraints(3, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- jdbcDriverLabel ----
        jdbcDriverLabel.setText(bundle.getString("BaseConfigPanel.jdbcDriverLabel.text"));
        add(jdbcDriverLabel, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        add(jdbcDriverTextField, new GridBagConstraints(3, 6, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- jdbcUrlLabel ----
        jdbcUrlLabel.setText(bundle.getString("BaseConfigPanel.jdbcUrlLabel.text"));
        add(jdbcUrlLabel, new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        add(jdbcUrlTextField, new GridBagConstraints(3, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- jdbcUsernameLabel ----
        jdbcUsernameLabel.setText(bundle.getString("BaseConfigPanel.jdbcUsernameLabel.text"));
        add(jdbcUsernameLabel, new GridBagConstraints(1, 8, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        add(jdbcUsernameTextField, new GridBagConstraints(3, 8, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- jdbcPasswordLabel ----
        jdbcPasswordLabel.setText(bundle.getString("BaseConfigPanel.jdbcPasswordLabel.text"));
        add(jdbcPasswordLabel, new GridBagConstraints(1, 9, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        add(jdbcPasswordTextField, new GridBagConstraints(3, 9, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- bindings ----
        bindingGroup = new BindingGroup();
        bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
            configModel, BeanProperty.create("author"),
            authorTextField, BeanProperty.create("text_ON_ACTION_OR_FOCUS_LOST")));
        bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
            configModel, BeanProperty.create("version"),
            versionTextField, BeanProperty.create("text_ON_ACTION_OR_FOCUS_LOST")));
        bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
            configModel, BeanProperty.create("since"),
            sinceTextField, BeanProperty.create("text_ON_ACTION_OR_FOCUS_LOST")));
        bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
            configModel, BeanProperty.create("templateDir"),
            templateDirTextField, BeanProperty.create("text")));
        bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
            configModel, BeanProperty.create("database"),
            databaseTextField, BeanProperty.create("selectedItem")));
        bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
            configModel, BeanProperty.create("jdbcDriver"),
            jdbcDriverTextField, BeanProperty.create("text_ON_ACTION_OR_FOCUS_LOST")));
        bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
            configModel, BeanProperty.create("jdbcUrl"),
            jdbcUrlTextField, BeanProperty.create("text_ON_ACTION_OR_FOCUS_LOST")));
        bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
            configModel, BeanProperty.create("jdbcUsername"),
            jdbcUsernameTextField, BeanProperty.create("text_ON_ACTION_OR_FOCUS_LOST")));
        bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
            configModel, BeanProperty.create("jdbcPassword"),
            jdbcPasswordTextField, BeanProperty.create("text_ON_ACTION_OR_FOCUS_LOST")));
        bindingGroup.addBinding(SwingBindings.createJComboBoxBinding(UpdateStrategy.READ_WRITE,
            dbTypes, databaseTextField));
        bindingGroup.bind();
        // End of component initialization  //GEN-END:initComponents
    }
}
