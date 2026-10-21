import{z as e,ao as t,ap as i,L as s,ax as a,ak as n,h as r,i as o}from"./952f98a9.js";var d=e`
:host {
  display: inline-block;
  position: relative;
  font: inherit;
  box-sizing: border-box;
  cursor: default;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

:host([aria-disabled=true]) {
  opacity: .4;
  cursor: default;
  pointer-events: none;
}

.container {
  display: flex;
  align-items: center;
}

.radio {
  flex: none;
  display: flex;
  justify-content: center;
  align-items: center;
  width: 1rem;
  height: 1rem;
  margin-right: .5em;
  border-radius: 50%;
  border: 1px solid #666666;
}

:host([active]) .radio {
  background-color: #E9E9E9;
}

.check {
  display: block;
  width: .5rem;
  height: .5rem;
  background-color: #004481;
  border-radius: 50%;
  opacity: 0;
}

:host([aria-checked=true]) .check {
  opacity: 1;
}

.slot-control ::slotted(input[type=radio]) {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  margin: 0;
  opacity: 0;
  z-index: -1;
  pointer-events: none;
}
`;class h extends(t(i(s))){static get properties(){return{disabled:{type:Boolean},readonly:{type:Boolean},value:{type:String,reflect:!0},checked:{type:Boolean,reflect:!0},required:{type:Boolean},name:{type:String,reflect:!0}}}constructor(){super(),this.value="on",this.__active=!1,this.checked=!1,this.disabled=!1,this.readonly=!1,this._onClick=this._onClick.bind(this),this._onKeyUp=this._onKeyUp.bind(this),this._onKeyDown=this._onKeyDown.bind(this),this.addEventListener("click",this._onClick),this.addEventListener("keyup",this._onKeyUp),this.addEventListener("keydown",this._onKeyDown),a(this,"down",(()=>{!this._disabled&&(this.active=!0)})),a(this,"up",(()=>{this.active=!1})),this.addEventListener("blur",(()=>{this.active=!1}))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.active&&(this.active=!1)}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._setInitialAttribute("role","radio"),this.hasAttribute("autofocus")&&(this._updateTabIndex(),this.focus())}updated(e){super.updated&&super.updated(e),(e.has("disabled")||e.has("readonly"))&&this.setAttribute("aria-disabled",this._disabled.toString()),e.has("checked")&&(this.setAttribute("aria-checked",this.checked.toString()),this.checked&&(this._uncheckGroup(),this.dispatchEvent(new CustomEvent("change",{bubbles:!0})),this.dispatchEvent(new CustomEvent("input",{bubbles:!0})))),(e.has("disabled")||e.has("readonly")||e.has("checked"))&&this._updateTabIndex()}get active(){return this.__active}set active(e){e!==this.__active&&(this.__active=e,e?this.setAttribute("active",""):this.removeAttribute("active"),this.dispatchEvent(new CustomEvent("active-change",{bubbles:!0,detail:{value:this.__active}})))}get _disabled(){return this.disabled||this.readonly&&!this.checked}static get styles(){return[d,n("bbva-core-radio-shared-styles")]}render(){return r` ${this._labelledInput} ${this._radio} `}get _labelledInput(){return r` <div class="container">${this._inputTemplate} ${this._labelTemplate}</div> `}get _inputTemplate(){return r`
      <slot name="input-template">
        <span class="radio">
          <span class="check"></span>
        </span>
      </slot>
    `}get _labelTemplate(){return r` <span class="label"><slot></slot></span> `}get _radio(){return this._formAssociated?r`
          <span class="slot-control"><slot name="_radio"></slot></span>

          <input
            aria-hidden="true"
            style="position: absolute; opacity: 0; pointer-events: none; z-index: -1;"
            @change="${this._onChange}"
            ?checked="${this.checked}"
            ?disabled="${this._disabled}"
            form="${o(this.form)}"
            id="${this._formElementId}"
            @input="${this._onInput}"
            name="${o(this.name)}"
            ?required="${this.required}"
            slot="_radio"
            tabindex="-1"
            type="radio"
            .value="${this.value}"
          />
        `:""}_queryParentRoot(e,t){const i=e.getRootNode()||document.documentElement;return Array.from(i.querySelectorAll(t))}_queryGroup(e=!1){return this.name?this._queryParentRoot(this,`${this.nodeName.toLowerCase()}[name=${this.name}]${e?":not([aria-disabled=true])":""}`):[]}_uncheckGroup(){const e=this._queryGroup();for(const t of e)t!==this&&(t.checked=!1,t._updateTabIndex())}_updateTabIndex(){this.setAttribute("tabindex",!this.checked&&this._isGroupChecked()||this._disabled?"-1":"0")}_isGroupChecked(){return this._queryGroup().find((e=>e.checked))}_setInitialAttribute(e,t){this.hasAttribute(e)||this.setAttribute(e,t)}_dispatchEvent(e){this.dispatchEvent(new CustomEvent(e,{bubbles:!0}))}_onInput(e){e.preventDefault(),e.stopPropagation()}_onChange(e){e.preventDefault(),e.stopPropagation(),this._onClick(e)}_onClick(e){if(this._disabled)return e.preventDefault(),e.stopPropagation(),void e.stopImmediatePropagation();this.checked=!0}_onKeyUp(e){"Enter"!==e.key&&" "!==e.key||!this.active||(this.active=!1,this.checked=!0,e.preventDefault(),e.stopPropagation())}_onKeyDown(e){"Enter"!==e.key&&" "!==e.key||(this.active=!0,e.preventDefault(),e.stopPropagation());["ArrowUp","ArrowRight","ArrowDown","ArrowLeft"].includes(e.key)&&this._row(e)}_row(e){const t=this._queryGroup(!0),i=t.indexOf(this),s=this._nextIndex(t,i,e.key);if(null!==s){const i=t[s];i.checked=!0,i.focus(),e.stopPropagation(),e.preventDefault()}}_nextIndex(e,t,i){if(0===e.length)return null;switch(i){case"ArrowUp":case"ArrowLeft":return t-1<0?e.length-1:t-1;case"ArrowRight":case"ArrowDown":return t+1>e.length-1?0:t+1;default:return null}}}export{h as B};
