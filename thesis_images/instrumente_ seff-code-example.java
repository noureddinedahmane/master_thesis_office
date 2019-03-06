    
    class ComponentA{
        private componentB; 
        
        void service(boolean condition,
                       List array){        
            ServiceParametersFactory serviceParametersFactory = new ServiceParametersFactoryImp();
		    ServiceParameters __serviceParameters7b0c60ab_1116_477e_b9aa_6409dc557bb5 = serviceParametersFactory
				.getServiceParameters(new Object[] { condition, array }, new String[] { "condition", "array" });
		    ThreadMonitoringController.getInstance().enterService("_sPEbUDkyEembGJ6iNCoQDQ",
				__serviceParameters7b0c60ab_1116_477e_b9aa_6409dc557bb5);
                
            // internal computation
            final long __tin_f7087098_bbc8_4043_b1a3_e489deb8c13a = ThreadMonitoringController.getInstance().getTime();
            innerMethod_1();
            ThreadMonitoringController.getInstance().logResponseTime("_tWldADkyEembGJ6iNCoQDQ", "_oro4gG3fEdy4YaaT-RYrLQ",
				__tin_f7087098_bbc8_4043_b1a3_e489deb8c13a);
            
            // Branch Action
            String __executedBranch_91862b17_279e_4025_99c5_1610bb6dc5da = null;            
            if(condition){
                __executedBranch_91862b17_279e_4025_99c5_1610bb6dc5da = "_tXW5EDkyEembGJ6iNCoQDQ";
                ThreadMonitoringController.getInstance().setCurrentCallerId("_tXeN0DkyEembGJ6iNCoQDQ");
                componentB.service_1();
            }
            else{
                __executedBranch_91862b17_279e_4025_99c5_1610bb6dc5da = "_tXW5EDkyEembGJ6iNCoQDQ";
                long __counter_346b00f9_23d0_4e68_a582_15925d8a030a = 0;
                for(item in array){
                    __counter_346b00f9_23d0_4e68_a582_15925d8a030a++;
                    ThreadMonitoringController.getInstance().setCurrentCallerId("_nXeN0DkyHdnbGJ6iNCoQDW");
                    componentB.service_2();
                }
                ThreadMonitoringController.getInstance().logLoopIterationCount("_tXbKgDkyEembGJ6iNCoQDQ",
					__counter_346b00f9_23d0_4e68_a582_15925d8a030a);
            }
            ThreadMonitoringController.getInstance().logBranchExecution("_tXVD4DkyEembGJ6iNCoQDQ",
				__executedBranch_91862b17_279e_4025_99c5_1610bb6dc5da);
            ThreadMonitoringController.getInstance().exitService();   
        }
        
        private innerMethod_1(){
            // internal computation
            // ...
        }
        
    }
    
    
    
    