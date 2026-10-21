import{z as t,an as e,aM as i,L as a,aN as s,ah as r,h as o,i as n,aD as l,ak as d,aO as c}from"./952f98a9.js";import{u as h,z as b,A as p,D as u,E as m,v as g,F as f,G as v,H as y,I}from"./216055dc.js";import{b as $,B as k}from"./d335c75d.js";const x=h([$,b,p,u,m]),S=Object.values(x);var z=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

.label-out {
  display: flex;
  padding: 0 0.875rem;
  margin: 0.5rem 0;
}
.label-out-text {
  display: inline;
  vertical-align: middle;
}
.label-out .right-align-container {
  display: flex;
  width: auto;
  align-items: flex-end;
  padding: 0;
}
.label-out .right-align-container [data-tag-name=bbva-button-default] {
  height: 1.375rem;
  padding: 0;
}

.label-optional-text {
  padding-left: 0.5rem;
}

[data-tag-name=bbva-type-link] {
  padding: 0;
  margin-left: 0.5rem;
}

[data-tag-name=bbva-divider-default] {
  margin-left: 0.5rem;
}

.divider-container {
  padding: 0 1rem;
}

/*
* Two option
*/
:host([two-option]) {
  position: relative;
  font-size: 0;
}
:host([two-option]) .label-out {
  padding: 0.5rem 1rem;
}
:host([two-option]) ::slotted(*) {
  display: inline-flex;
  min-width: min-content;
  max-width: 50%;
}
:host([two-option]) .notification-error {
  margin: 0 1rem 0.5rem;
}
`;class A extends(g(e(i(a)))){static get is(){return"bbva-form-radio-group"}static get scopedElements(){return{"bbva-form-radio-button":k,"bbva-notification-help":f,"bbva-type-text":v,"bbva-type-link":y,"bbva-divider-default":I}}static get properties(){return{name:{type:String,reflect:!0},items:{type:Array},selected:{type:Number,reflect:!0},readonly:{type:Boolean},required:{type:Boolean},disabled:{type:Boolean},invalid:{type:Boolean,reflect:!0},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},twoOption:{type:Boolean,reflect:!0,attribute:"two-option"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},labelOut:{type:String,attribute:"label-out"},helpIcon:{type:Boolean,attribute:"help-icon"},linkHref:{type:String,attribute:"link-href"},linkAccessibilityText:{type:String,attribute:"link-accessibility-text"},divider:{type:Boolean},accessibilityIconAlertNotification:{type:String,attribute:"accessibility-icon-alert-notification"},optionalLabel:{type:String,attribute:"optional-label"},labelMediumOut:{type:Boolean,attribute:"label-medium-out",reflect:!0}}}constructor(){super(),this.items=[],this.selected=-1,this.readonly=!1,this.optionalLabel="bbva-form-radio-group-optional-label",this.labelMediumOut=!1,this.disabled=!1,this.invalid=!1,this.errorIcon=s(),this.errorIconSize=16,this.errorMessage="",this.twoOption=!1,this.infoIcon=r(),this.infoIconSize=16,this.labelOut="",this.helpIcon=!1,this.name=`form-radio-group-${((t=10)=>`${Math.random().toString(36).substr(2,t)}`)()}`,this.linkHref="",this.linkAccessibilityText="bbva-form-radio-group-link-accessibility-text",this.divider=!1,this.accessibilityIconAlertNotification=""}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","radiogroup"),this.addEventListener("slotschanges",this._setRadioName)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("slotschanges",this._setRadioName)}_setRadioName(t){(((t||{}).detail||{}).contentSlots||[]).forEach((t=>{const e=(t||{}).assignedNodes;"bbva-form-radio-button"===(e.getAttribute("data-tag-name")||(e||{}).nodeName).toLowerCase()&&(e.name=this.name)}))}get radioItems(){return Array.from(this.querySelectorAll('[data-tag-name="bbva-form-radio-button"]'))}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._itemsContainer=this.shadowRoot.querySelector(".form-radio-group-container"),this._itemsContainer&&this.appendChild(this._itemsContainer.content),this.addEventListener("change",(t=>this._updateItems(t)))}updated(t){if(super.updated&&super.updated(t),t.has("selected")&&this.radioItems.length)if(Number.isFinite(this.selected)&&this.selected>-1&&this.selected<this.radioItems.length)this.radioItems[this.selected].checked=!0;else{const t=this.radioItems.find((t=>t.checked));t&&(t.checked=!1)}t.has("disabled")&&this.radioItems.length&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].disabled=this.disabled}))),t.has("invalid")&&this.radioItems.length&&(this.setAttribute("aria-invalid",this.invalid.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].invalid=this.invalid}))),t.has("readonly")&&this.radioItems.length&&(this.setAttribute("aria-readonly",this.readonly.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].readonly=this.readonly}))),t.has("required")&&this.radioItems.length&&(this.setAttribute("aria-required",this.required.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].required=!1})),this.radioItems[0].required=!0)}_updateItems(t){const e=this.radioItems.indexOf(t.target);this.selected=e,this.invalid=!1,this.dispatchEvent(new CustomEvent("form-radio-group-item-change",{detail:{value:t.target.value,selected:e},bubbles:!0,composed:!0}))}_helpClicked(t){t.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-form-radio-group-help-click",{detail:!0,bubbles:!0,composed:!0}))}get _helpIcon(){return o`
      ${this.helpIcon?o` <div class="right-align-container">
            <bbva-type-link
              aria-label="${this.t(this.linkAccessibilityText)}"
              icon-size="16"
              @click="${this._helpClicked}"
              href="${n(this.linkHref)}"
              icon="${l()}"
            >
            </bbva-type-link>
          </div>`:o``}
    `}get _labelOut(){if(this.labelOut){const t=this.t(this.labelOut);return o`
        <div class="label-out">
          <div>
            <bbva-type-text
              size="S"
              text="${t}"
              unset
              class="label-out-text"
              font-weight="${this.labelMediumOut?"500":""}"
            >
            </bbva-type-text>
            ${this.optionalLabel?o` <bbva-type-text
                  id="optional"
                  class="label-out-text"
                  size="S"
                  unset
                  text="${this.required?"":`${this.t(this.optionalLabel)}`}"
                >
                </bbva-type-text>`:o``}
          </div>
          ${this._helpIcon}
        </div>
      `}return""}get _divider(){return o`
      ${this.divider?o`
            <div class="divider-container">
              <bbva-divider-default></bbva-divider-default>
            </div>
          `:o``}
    `}get _notificationError(){return o`
      ${this.invalid&&this.errorMessage?o`
            <bbva-notification-help
              class="notification-error"
              accessibility-label-icon="${this.accessibilityIconAlertNotification}"
              variant="alert"
              .icon="${this.errorIcon}"
              .iconSize="${this.errorIconSize}"
              .text="${this.errorMessage}"
              hide-top-padding
              hide-bottom-padding
              hide-left-padding
              hide-right-padding
            ></bbva-notification-help>
          `:""}
    `}static get styles(){return[z,S,d("bbva-form-radio-group-shared-styles")]}render(){return o`
      ${this._labelOut}
      <slot></slot>
      <div class="container">
        <template class="form-radio-group-container">
          ${this.items.map((t=>o`
              <bbva-form-radio-button
                .name="${this.name}"
                .value="${t.value}"
                label="${t.label}"
                ?disabled="${t.disabled}"
                ?checked="${t.checked}"
                ?required="${t.required}"
                ?label-medium="${t.labelMedium}"
                .errorIcon="${this.errorIcon}"
                .errorIconSize="${this.errorIconSize}"
                .errorMessage="${t.invalid?t.errorMessage:""}"
                .infoIcon="${this.infoIcon}"
                .infoIconSize="${this.infoIconSize}"
                .infoMessage="${t.infoMessage}"
                accessibility-icon-info-notification="${n(t.accessibilityIconInfo)}"
                accessibility-icon-alert-notification="${n(t.accessibilityIconAlert)}"
                variant="${n(t.variant)}"
                .divider="${t.divider}"
              >
                ${t.text?c(t.text):t.label}
              </bbva-form-radio-button>
            `))}
        </template>
      </div>
      ${this._notificationError} ${this._divider}
    `}}export{A as B,x as b};
