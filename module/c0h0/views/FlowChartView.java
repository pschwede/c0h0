package org.jalgo.module.c0h0.views;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.view.mxGraph;

public class FlowChartView extends View {
	/**
	 * Eclipse is my friend (sometimes).
	 */
	private static final long serialVersionUID = 1993191423448829250L;
	
	protected JButton fcViewButtonZoomIn;
	protected JButton fcViewButtonZoomOut;
	
	public mxGraphComponent graphComponent;
	private EventHandler eventHandler;
	
	public FlowChartView() {
		
		JPanel completeFlowChartView = new JPanel();
		completeFlowChartView.setLayout(new BoxLayout(completeFlowChartView, BoxLayout.Y_AXIS));
		JPanel navigateFlowChart = new JPanel();
		navigateFlowChart.setLayout(new BoxLayout(navigateFlowChart, BoxLayout.X_AXIS));

		fcViewButtonZoomIn = new JButton("+");
		fcViewButtonZoomOut = new JButton("-");

		eventHandler = new EventHandler();

		mxGraph flowChartGraph = new mxGraph();
		JButton fcViewButtonZoomIn = new JButton("+");
		fcViewButtonZoomIn.addActionListener(eventHandler);
		JButton fcViewButtonZoomOut = new JButton("-");
		fcViewButtonZoomOut.addActionListener(eventHandler);
		mxRectangle minimumSize = new mxRectangle();
		minimumSize.setWidth(520);
		minimumSize.setHeight(420);
		
		Object parent = flowChartGraph.getDefaultParent();
		flowChartGraph.getModel().beginUpdate();
		
		try {
			Object v1 = flowChartGraph.insertVertex(parent, null,
					"if ( x1  > 0 )", 20, 20, 80, 30, "ROUNDED");
			Object v2 = flowChartGraph.insertVertex(parent, null, "x1 = x1 + 1;", 20,
					150, 80, 30, "ROUNDED");
			Object v3 = flowChartGraph.insertVertex(parent, null, null, 150, 35,
					0, 0);
			Object v4 = flowChartGraph.insertVertex(parent, null, null, 150,
					165, 0, 0);
			flowChartGraph.insertEdge(parent, null, "then\nf111", v1, v2);
			flowChartGraph.insertEdge(parent, null, null, v2, v4);
			flowChartGraph.insertEdge(parent, null, "else", v4, v3);
			flowChartGraph.insertEdge(parent, null, null, v3, v1);
			flowChartGraph.setMinimumGraphSize(minimumSize);
		} finally {
			flowChartGraph.getModel().endUpdate();
		}

		graphComponent = new mxGraphComponent(flowChartGraph);
		graphComponent.setDragEnabled(false);
		graphComponent.setSize(500, 500);
		graphComponent.setMinimumSize(new Dimension());
		graphComponent.setEnabled(true);
		graphComponent.setZoomFactor(1.3);
		
		navigateFlowChart.add(fcViewButtonZoomIn);
		navigateFlowChart.add(fcViewButtonZoomOut);
		completeFlowChartView.add(graphComponent);
		completeFlowChartView.add(navigateFlowChart);
		this.add(completeFlowChartView);
	}

	public class EventHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (((JButton) event.getSource()).getText().equals("+") ) {
				graphComponent.zoomIn();
			}
			if (((JButton) event.getSource()).getText().equals("-") ) {
				graphComponent.zoomOut();
			}
		}
	}

}
