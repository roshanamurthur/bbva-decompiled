import{z as t,L as e,ak as i,h as s,i as r}from"./952f98a9.js";import{O as o,P as n}from"./7f3d7ca9.js";var a=t`:host {
  font: inherit;
  cursor: pointer;
  text-align: center;
  user-select: none;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  color: var(--cells-button-color, rgba(0, 0, 0, 0.847));
  border-width: 1px;
  border-style: solid;
  border-color: var(--cells-button-border-color, #d8d8d8);
  border-radius: 4px;
  padding: 0.25em .5em;
  box-sizing: border-box;
  @apply --cells-button; }

:host([hidden]), [hidden] {
  display: none !important; }

*, *:before, *:after {
  box-sizing: inherit; }

:host([disabled]) {
  cursor: default;
  pointer-events: none;
  color: var(--cells-button-disabled-color, rgba(0, 0, 0, 0.247));
  @apply --cells-button-disabled; }
`;class l extends(o(e)){static get is(){return"cells-button"}static get properties(){return{type:{type:String},disabled:{type:Boolean,reflect:!0},value:{type:String,reflect:!0},name:{type:String,reflect:!0},form:{type:String},formAction:{type:String,reflect:!0},formEnctype:{type:String,reflect:!0},formMethod:{type:String,reflect:!0},formNoValidate:{type:Boolean,reflect:!0},formTarget:{type:String,reflect:!0},_formElementId:{type:String}}}constructor(){super(),this.type="submit",this._active=!1,this._formElementId=this.uniqueID()}uniqueID(t=10){return`_${Math.random().toString(36).substr(2,t)}`}connectedCallback(){super.connectedCallback(),this._setInitialAttribute("role","button"),this.disabled?this._disableButton():(this._setInitialAttribute("tabindex","0"),this.setAttribute("aria-disabled","false")),this.onClick=this.onClick.bind(this),this.onKeyUp=this.onKeyUp.bind(this),this.onKeyDown=this.onKeyDown.bind(this),this.addEventListener("click",this.onClick),this.addEventListener("keyup",this.onKeyUp),this.addEventListener("keydown",this.onKeyDown),n(this,"down",(()=>!this.disabled&&(this.active=!0))),n(this,"up",(()=>this.active=!1)),this.addEventListener("blur",(()=>this.active=!1)),this.hasAttribute("autofocus")&&this.focus()}disconnectedCallback(){super.disconnectedCallback(),this.removeEventListener("click",this.onClick),this.removeEventListener("keydown",this.onKeyDown),this.active&&(this.active=!1)}firstUpdated(t){super.firstUpdated(t),this._formElement=this.shadowRoot.querySelector(`#${this._formElementId}`),this._formElement&&this.appendChild(this._formElement)}updated(t){super.updated(t),t.has("disabled")&&(this.disabled?this._disableButton():this._enableButton())}get active(){return this._active}set active(t){t!==this._active&&(this._active=t,t?this.setAttribute("active",""):this.removeAttribute("active"))}static get shadyStyles(){return`\n      ${a.cssText}\n      ${i("cells-button-shared-styles").cssText}\n    `}render(){return s`
      <style>${this.constructor.shadyStyles}</style>
      <slot></slot>
      ${this._button}
    `}get _button(){return s`
      <button
        style="display: none;"
        id="${this._formElementId}"
        aria-hidden="true"
        tabindex="-1"
        type="${this.type}"
        ?disabled="${this.disabled}"
        name="${r(this.name)}"
        value="${r(this.value)}"
        form="${r(this.form)}"
        formaction="${r(this.formAction)}"
        formenctype="${r(this.formEnctype)}"
        formmethod="${r(this.formMethod)}"
        ?formNoValidate="${r(this.formNoValidate)}"
        formtarget="${r(this.formTarget)}">
      </button>
    `}_setInitialAttribute(t,e){this.hasAttribute(t)||this.setAttribute(t,e)}_disableButton(){this.setAttribute("aria-disabled","true"),this.setAttribute("tabindex","-1")}_enableButton(){this.setAttribute("aria-disabled","false"),this.setAttribute("tabindex","0")}onClick(t){if(this.disabled)return t.preventDefault(),t.stopPropagation(),void t.stopImmediatePropagation();!t.defaultPrevented&&this._formElement&&t.target!==this._formElement&&this._formElement.dispatchEvent(new MouseEvent("click",{relatedTarget:this,composed:!0}))}onKeyUp(t){13!==t.keyCode&&32!==t.keyCode||!this.active||(this.active=!1,this.dispatchEvent(new MouseEvent("click",{bubbles:!0,composed:!0,cancelable:!0})),t.preventDefault(),t.stopPropagation())}onKeyDown(t){13!==t.keyCode&&32!==t.keyCode||(this.active=!0,t.preventDefault(),t.stopPropagation())}}customElements.define(l.is,l);export{l as C};
