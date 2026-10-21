import{z as t,aX as e,an as s,L as a,ak as i,h as o,aY as r}from"./952f98a9.js";import{L as c,M as n,N as m,D as b,O as l,e as d,K as p,G as u,P as h,Q as v}from"./216055dc.js";var g=t`
:host {
  display: block;
  box-sizing: border-box;
  --bbva-progress-content-z-index: 11;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

.list-simple {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
}
`;class x extends(e(s(c(n(a))))){static get is(){return"bbva-feature-upgrade-customer-success-mx"}static get styles(){return[g,m.primary,b.primary,l.primary,i("bbva-feature-upgrade-customer-success-mx-shared-styles")]}static get scopedElements(){const t=[d,p,u,h,v,...x.configurationScopedElements()];return x.scopedElementsFromClasses(t)}static get properties(){return{_eventPageName:{type:String,state:!0},_isVisible:{type:Boolean,state:!0},_isN2:{type:Boolean,state:!0},_pendingDocuments:{type:Boolean,state:!0},params:{type:Object},_dateOptions:{type:Object,state:!0}}}constructor(){super(),this._eventPageName="bbva-feature-upgrade-customer-success-mx",this._isVisible=!1,this._isN2=!1,this._pendingDocuments=!1,this.params={},this._dateOptions={day:"2-digit",month:"short",year:"numeric",hour:"2-digit",minute:"2-digit"}}firstUpdated(){this._isVisible=!0}initSuccess(t){this.params=t,this._pendingDocuments=!this.params.dossiersCompleted,this._isN2=Boolean("02"===this.params.accountLevel)}_closeModal(){this._dispatchCustomEvent(`${this._eventPageName}-dossiers-completed`,this._pendingDocuments),this._dispatchCustomEvent(`${this._eventPageName}-modal-exit`,{productId:this.params.accountId})}get _successModal(){return o`
      <div slot="slot-content"  tabindex="0">
        <bbva-clip-microillustration
          size="M"
          alt-microillustration="success"
          alt-image="success"
        ></bbva-clip-microillustration>
        <bbva-type-text
          text="${this.t("bbva-feature-upgrade-customer-mx-modal-success-body-title")}"
          size="3XL"
          font-weight="${r.fontWeight50}"
        ></bbva-type-text>
        <bbva-type-text
          text="${this._isN2?"bbva-feature-upgrade-customer-mx-modal-success-body-text":""}"
          size="S"
        ></bbva-type-text>
        ${this._listedItem}
        ${this._contentNotifications}
      </div>       
    `}get _listedItem(){return o`
       <div class="list-simple">
        <bbva-type-text
          text="${this.t("bbva-feature-upgrade-customer-mx-modal-success-list-text-1")}"
          size="S"
          alignment="left"
        ></bbva-type-text>
        <bbva-type-text
          text="${this.t("bbva-feature-upgrade-customer-mx-modal-success-list-text-4")}"
          font-weight="${r.fontWeight40}"
          size="S"
          alignment="right"
        ></bbva-type-text>
        </div>
        <div class="list-simple">
        <bbva-type-text
          text="${this.t("bbva-feature-upgrade-customer-mx-modal-success-list-text-2")}"
          size="S"
        ></bbva-type-text>
        <bbva-type-text
          text="${this.params.operationNumber}"
          font-weight="${r.fontWeight40}"
          size="S"
        ></bbva-type-text>
        </div>
        <div class="list-simple">
        <bbva-type-text
          text="${this.t("bbva-feature-upgrade-customer-mx-modal-success-list-text-3")}"
          size="S"
        ></bbva-type-text>
        <bbva-type-date
          .options="${this._dateOptions}"
          date-clock-suffix="h"
          date="${this.params.operationDate}"
          font-weight="${r.fontWeight40}"
          font-style="italic"
        ></bbva-type-date>
        </div>
  `}get _contentNotifications(){return o`
      <div>
        <bbva-notification-message
          variant="default"
          book-title
          message-title=${this.params.dossiersCompleted?"bbva-feature-upgrade-customer-mx-modal-success-notification-2":"bbva-feature-upgrade-customer-mx-modal-success-notification-1"}
        >      
        </bbva-notification-message>
        <br>
        <bbva-notification-message
          book-title
          message-title="${this.t("bbva-feature-upgrade-customer-mx-modal-success-notification-3")}"      
        >
          <bbva-type-text
            font-weight="${r.fontWeight40}"
            size="XS"
            text="${this.params.email&&this.params.email.replace(/\*+/g,"•")}"
          ></bbva-type-text>
        </bbva-notification-message>
      </div>
    `}render(){return o`
      ${super.render()} 
      <bbva-help-modal
        id="success"
        header-close-icon-aria-label="close"
        full-height
        header-text="${this.t("bbva-feature-upgrade-customer-mx-modal-success-header-text")}"
        ?visible="${this._isVisible}"
        @header-main-close-icon-click="${()=>this._closeModal()}"
      >
    ${this._successModal}    
    </bbva-help-modal>`}}customElements.define(x.is,x);
