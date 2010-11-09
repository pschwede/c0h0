package org.jalgo.module.c0h0.gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

public class FlowChartView extends View {
	/**
	 * Eclipse is my friend (sometimes).
	 */
	private static final long serialVersionUID = 1993191423448829250L;
	private mxGraphComponent graphComponent;
	private void flowChartZoomInAction(ActionEvent e) {
		graphComponent.zoomIn();
	};
	private void flowChartZoomOutAction(ActionEvent e) {
		graphComponent.zoomOut();
	};
	public FlowChartView() {
		mxGraph flowChartGraph = new mxGraph();
		Object parent = flowChartGraph.getDefaultParent();
		flowChartGraph.getModel().beginUpdate();
		
		try {
			Object v1 = flowChartGraph.insertVertex(parent, null,
					"<b>Hello</b>", 20, 20, 80, 30, "ROUNDED");
			Object v2 = flowChartGraph.insertVertex(parent, null, "World!", 20,
					150, 80, 30, "ROUNDED");
			Object v3 = flowChartGraph.insertVertex(parent, null, null, 150, 35,
					0, 0);
			Object v4 = flowChartGraph.insertVertex(parent, null, null, 150,
					165, 0, 0);
			flowChartGraph.insertEdge(parent, null, "then\nf111", v1, v2);
			flowChartGraph.insertEdge(parent, null, null, v2, v4);
			flowChartGraph.insertEdge(parent, null, "else", v4, v3);
			flowChartGraph.insertEdge(parent, null, null, v3, v1);
		} finally {
			flowChartGraph.getModel().endUpdate();
		}

		mxGraphComponent graphComponent = new mxGraphComponent(flowChartGraph);
		graphComponent.setDragEnabled(false);
		graphComponent.setSize(500, 500);
		graphComponent.setMinimumSize(new Dimension());
		graphComponent.setEnabled(true);
		this.add(graphComponent);
		
		JButton zoomIn = new JButton("+");
		
		JButton zoomOut = new JButton("-");
		
		zoomIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flowChartZoomInAction(e);
			}
		});
		zoomOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flowChartZoomOutAction(e);
			}
		});
		this.add(zoomIn);
		this.add(zoomOut);
	}

}
