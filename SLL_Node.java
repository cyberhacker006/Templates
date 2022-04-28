public class SLL_Node{
	// before using this class you have to get SLL class
		private Object data;
		private SLL_Node link;
		public SLL_Node(Object dataToAdd){
			this.data = dataToAdd;
			this.link = null;
		}
		public Object getData() {
			return data;
		}
		public void setData(Object data) {
			this.data = data;
		}
		public SLL_Node getLink() {
			return link;
		}
		public void setLink(SLL_Node link) {
			this.link = link;
		}
	}
