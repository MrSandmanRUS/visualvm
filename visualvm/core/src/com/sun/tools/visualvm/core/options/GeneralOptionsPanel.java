/*
 * Copyright 2007-2008 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */

package com.sun.tools.visualvm.core.options;

import java.util.logging.Logger;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.netbeans.modules.profiler.ProfilerIDESettings;

final class GeneralOptionsPanel extends javax.swing.JPanel {

    final private static Logger LOGGER = Logger.getLogger("com.sun.tools.visualvm.core.options");
    private final GeneralOptionsPanelController controller;

    transient private final ChangeListener changeListener = new ChangeListener() {
        public void stateChanged(ChangeEvent e) {
            controller.changed();
        }
    };
    
    GeneralOptionsPanel(GeneralOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
        startTrackingChanges();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        mhRefresh = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        thrdRefresh = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        dataRefresh = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        mhRefresh1 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dataRefresh1 = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        jLabel1.setDisplayedMnemonic('h');
        jLabel1.setLabelFor(mhRefresh);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, "Monitored Host:");

        jLabel2.setDisplayedMnemonic('t');
        jLabel2.setLabelFor(thrdRefresh);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, "Threads:");

        jLabel3.setDisplayedMnemonic('m');
        jLabel3.setLabelFor(dataRefresh);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, "Monitored Data:");

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, "Polling");

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, "sec.");

        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, "sec.");

        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, "sec.");

        org.openide.awt.Mnemonics.setLocalizedText(jLabel9, "Charts Cache");

        jLabel10.setDisplayedMnemonic('h');
        jLabel10.setLabelFor(mhRefresh);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel10, "Monitored Host:");

        org.openide.awt.Mnemonics.setLocalizedText(jLabel11, "min.");

        org.openide.awt.Mnemonics.setLocalizedText(jLabel12, "min.");

        jLabel13.setDisplayedMnemonic('m');
        jLabel13.setLabelFor(dataRefresh);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel13, "Monitored Data:");

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, "Profiler");

        org.openide.awt.Mnemonics.setLocalizedText(jButton1, "Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel14, "Reset Do Not Show Again confirmations:");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jLabel4)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED))
                            .add(layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel1)
                                    .add(jLabel2)
                                    .add(jLabel3))
                                .add(35, 35, 35)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(dataRefresh)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, thrdRefresh)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, mhRefresh, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel6)
                                    .add(jLabel8)
                                    .add(jLabel7))))
                        .add(10, 10, 10))
                    .add(layout.createSequentialGroup()
                        .add(jLabel9)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jSeparator3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(layout.createSequentialGroup()
                                .add(jLabel10)
                                .add(36, 36, 36)
                                .add(mhRefresh1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 66, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel11))
                            .add(layout.createSequentialGroup()
                                .add(jLabel13)
                                .add(35, 35, 35)
                                .add(dataRefresh1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel12)))
                        .add(91, 91, 91))
                    .add(layout.createSequentialGroup()
                        .add(jLabel5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jSeparator4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jLabel14)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 27, Short.MAX_VALUE)
                        .add(jButton1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel4)
                    .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jLabel6)
                    .add(mhRefresh, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jLabel7)
                    .add(thrdRefresh, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jLabel8)
                    .add(dataRefresh, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel9)
                    .add(jSeparator3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel10)
                    .add(jLabel11)
                    .add(mhRefresh1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel13)
                    .add(jLabel12)
                    .add(dataRefresh1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel5)
                    .add(jSeparator4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1)
                    .add(jLabel14))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    ProfilerIDESettings.getInstance().clearDoNotShowAgainMap();
    jButton1.setEnabled(false);
}//GEN-LAST:event_jButton1ActionPerformed

    void load() {
        // TODO read settings and initialize GUI
        // Example:        
        // someCheckBox.setSelected(Preferences.userNodeForPackage(CorePanel.class).getBoolean("someFlag", false));
        // or for org.openide.util with API spec. version >= 7.4:
        // someCheckBox.setSelected(NbPreferences.forModule(CorePanel.class).getBoolean("someFlag", false));
        // or:
        // someTextField.setText(SomeSystemOption.getDefault().getSomeStringProperty());
        jButton1.setEnabled(true);
        mhRefresh.setValue(GlobalPreferences.sharedInstance().getMonitoredHostPoll());
        dataRefresh.setValue(GlobalPreferences.sharedInstance().getMonitoredDataPoll());
        thrdRefresh.setValue(GlobalPreferences.sharedInstance().getThreadsPoll());
        mhRefresh1.setValue(GlobalPreferences.sharedInstance().getMonitoredHostCache());
        dataRefresh1.setValue(GlobalPreferences.sharedInstance().getMonitoredDataCache());
    }

    void store() {
        GlobalPreferences.sharedInstance().setMonitoredHostPoll((Integer) mhRefresh.getValue());
        GlobalPreferences.sharedInstance().setMonitoredDataPoll((Integer) dataRefresh.getValue());
        GlobalPreferences.sharedInstance().setThreadsPoll((Integer) thrdRefresh.getValue());
        GlobalPreferences.sharedInstance().setMonitoredHostCache((Integer) mhRefresh1.getValue());
        GlobalPreferences.sharedInstance().setMonitoredDataCache((Integer) dataRefresh1.getValue());
        // TODO store modified settings
        // Example:
        // Preferences.userNodeForPackage(CorePanel.class).putBoolean("someFlag", someCheckBox.isSelected());
        // or for org.openide.util with API spec. version >= 7.4:
        // NbPreferences.forModule(CorePanel.class).putBoolean("someFlag", someCheckBox.isSelected());
        // or:
        // SomeSystemOption.getDefault().setSomeStringProperty(someTextField.getText());
        GlobalPreferences.sharedInstance().store();
    }

    boolean valid() {
        try {
            int mh = (Integer) mhRefresh.getValue();
            int md = (Integer) dataRefresh.getValue();
            int th = (Integer) thrdRefresh.getValue();
            int mhc = (Integer) mhRefresh1.getValue();
            int mdc = (Integer) dataRefresh1.getValue();
            return mh > 0 && md > 0 && th > 0 && mhc > 0 && mdc > 0;
        } catch (Exception e) {
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner dataRefresh;
    private javax.swing.JSpinner dataRefresh1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSpinner mhRefresh;
    private javax.swing.JSpinner mhRefresh1;
    private javax.swing.JSpinner thrdRefresh;
    // End of variables declaration//GEN-END:variables

    private void startTrackingChanges() {
        mhRefresh.getModel().addChangeListener(changeListener);
        thrdRefresh.getModel().addChangeListener(changeListener);
        dataRefresh.getModel().addChangeListener(changeListener);
        mhRefresh1.getModel().addChangeListener(changeListener);
        dataRefresh1.getModel().addChangeListener(changeListener);
    }
}
