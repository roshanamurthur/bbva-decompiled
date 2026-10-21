import{z as t,ao as e,ap as i,L as s,aq as a,ak as n,h as r,i as h}from"./952f98a9.js";var o=t`
:host {
  display: block;
  box-sizing: border-box;
  position: relative;
  overflow: hidden;
  outline: none; }

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

.container {
  display: flex;
  justify-content: center;
  position: relative;
}

.bar {
  display: flex;
  align-items: center;
  position: absolute;
  top: 50%;
  left: 0;
  overflow: hidden;
  width: 100%;
  height: 1rem;
  transform: translateY(-50%);
}

.bar-filled {
  position: absolute;
  right: calc(100% - 1rem / 2);
  width: calc(100% - 1rem);
  height: .25rem;
  background-color: #49A5E6;
}

.bar-filled::before {
  content: '';
  position: absolute;
  top: 0;
  right: 100%;
  width: 1rem;
  height: 100%;
  background-color: inherit;
}

:host([aria-readonly=true]) .bar-filled {
  background-color: #666666;
}

.bar::before {
  content: '';
  flex: auto;
  height: .25rem;
  background-color: #D3D3D3;
}

.current {
  position: relative;
  width: calc(100% - 1rem);
}

.knob {
  position: relative;
  width: 1rem;
  height: 1rem;
  background-color: #1973B8;
  border-radius: 50%;
  border: 1px solid #FFFFFF;
  transform: translateX(-50%);
  cursor: pointer;
}

:host([aria-disabled=true]) .knob,
:host([aria-readonly=true]) .knob {
  cursor: default;
}

:host([aria-readonly=true]) .knob {
  background-color: #666666;
}

:host([focus-visible]:not([aria-disabled=true])) .knob {
  box-shadow: 0 0 4px #043263;
}

.slot-control ::slotted(*) {
  position: absolute;
  bottom: 0;
  left: 0;
  z-index: -1;
  width: 100%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: flex-end;
  margin: 0;
  opacity: 0;
  pointer-events: none;
}

:host([aria-disabled=true]) {
  outline: none;
  opacity: .4;
}
`;class l extends(e(i(s))){static get properties(){return{autocomplete:{type:Boolean},disabled:{type:Boolean},max:{type:Number},min:{type:Number},name:{type:String},readonly:{type:Boolean},step:{type:Number},value:{type:Number}}}constructor(){super(),this.name="",this.min=0,this.max=100,this.step=1,this._onKeydown=this._onKeydown.bind(this),this.addEventListener("keydown",this._onKeydown)}get min(){return this._min}set min(t){const e=this._min;e!==t&&(this._min=t,this.setAttribute("aria-valuemin",t),this.requestUpdate("min",e))}get max(){return this._max}set max(t){const e=this._max;e!==t&&(this._max=t,this.setAttribute("aria-valuemax",t),this.requestUpdate("max",e))}get value(){return this._value}set value(t){const e=this._value;e!==t&&(this._value=this._inMinMaxRange(t),this.setAttribute("aria-valuenow",this._value),this.requestUpdate("value",e))}get _innerValue(){return this._calcStep(this.value)}get _currentValue(){return this._inMinMaxRange(this._innerValue)}get _ratio(){return(this._currentValue-this.min)/(this.max-this.min)}get _percent(){return 100*this._ratio+"%"}get _largeStep(){return Math.max((this.max-this.min)/10,this.step)}update(t){this._rendered||void 0!==this.value||(this.value=this._calcStep((this.max-this.min)/2+this.min)),super.update(t)}firstUpdated(t){super.firstUpdated(t),this._setInitialAttribute("role","slider"),this.disabled||(this._setInitialAttribute("tabindex","0"),this._setInitialAttribute("aria-disabled","false")),this.readonly||this._setInitialAttribute("aria-readonly","false"),this._rendered=!0,this._bar=this.shadowRoot.querySelector(".bar"),this._knob=this.shadowRoot.querySelector(".knob"),a(this._knob,"track",(t=>this._onTrack(t))),a(this._knob,"down",(t=>this._onKnobDown(t))),this.hasAttribute("autofocus")&&this.focus()}updated(t){super.updated&&super.updated(t),t.has("disabled")&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.setAttribute("tabindex",this.disabled?"-1":"0")),t.has("readonly")&&this.setAttribute("aria-readonly",this.readonly.toString())}static get styles(){return[o,n("bbva-core-range-shared-styles")]}get _controlBlock(){return r`
      <div class="container" @click="${this._barClick}" aria-hidden="true">
        ${this._barBlock} ${this._knobBlock}
      </div>
    `}get _barBlock(){return r`
      <div class="bar">
        <div class="bar-filled" style="transform: translateX(${this._percent});"></div>
      </div>
    `}get _knobBlock(){return r`
      <div class="current" style="transform: translateX(${this._percent});">
        <div
          class="knob"
          @click="${t=>{t.stopPropagation()}}"
        >
          ${this._knobContent}
        </div>
      </div>
    `}get _knobContent(){return r``}get _input(){return this._formAssociated?r`
          <span class="slot-control">
            <slot name="_slider"></slot>
          </span>

          <input
            ?disabled="${this.disabled}"
            ?readonly="${this.readonly}"
            .value="${this.value}"
            @input="${this._onInputInput}"
            @change="${this._onInputChange}"
            aria-hidden="true"
            style="position: absolute; opacity: 0; pointer-events: none; z-index: -1;"
            autocomplete="${this.autocomplete?"on":"off"}"
            form="${h(this.form)}"
            id="${this._formElementId}"
            max="${this.max}"
            min="${this.min}"
            name="${h(this.name)}"
            slot="_slider"
            step="${this.step}"
            tabindex="-1"
            type="range"
          />
        `:""}render(){return r` ${this._controlBlock} ${this._input} `}stepUp(t=1){const e=this._inMinMaxRange(this.value+this.step*t);this.value=this._calcStep(e)}stepDown(t=1){const e=this._inMinMaxRange(this.value-this.step*t);this.value=this._calcStep(e)}_setInitialAttribute(t,e){this.hasAttribute(t)||this.setAttribute(t,e)}_inMinMaxRange(t){return Math.max(this.min,Math.min(t,this.max))}_calcStep(t){let e=parseFloat(t);if(!this.step)return e;const i=Math.round((e-this.min)/this.step);return e=this.step<1?i/(1/this.step)+this.min:i*this.step+this.min,e}_onInputInput(t){t.stopPropagation(),t.preventDefault(),this.value=t.target.value}_onInputChange(t){t.stopPropagation(),t.preventDefault()}_onKeydown(t){switch(t.key.toLowerCase()){case"arrowleft":case"arrowdown":this._keyUpdate(t,(()=>this.stepDown()));break;case"arrowright":case"arrowup":this._keyUpdate(t,(()=>this.stepUp()));break;case"home":this._keyUpdate(t,(()=>{this.value=this._calcStep(this.min)}));break;case"end":this._keyUpdate(t,(()=>{this.value=this._calcStep(this.max)}));break;case"pagedown":this._keyUpdate(t,(()=>this.stepDown(this._largeStep/this.step)));break;case"pageup":this._keyUpdate(t,(()=>this.stepUp(this._largeStep/this.step)))}}_keyUpdate(t,e){if(!this.disabled&&!this.readonly){t.preventDefault();const i=this.value;e(),this._fireChanges(i)}}_onKnobDown(t){this.disabled||(t.preventDefault(),this.focus())}_onTrack(t){if(!this.disabled&&!this.readonly)switch(t.preventDefault(),t.stopPropagation(),t.detail.state){case"start":this._trackStart(t);break;case"track":this._trackX(t);break;case"end":this._trackEnd()}}_trackStart(){this._knobWidth=this._knob.offsetWidth,this._barWidth=this._bar.offsetWidth-this._knobWidth,this._startX=this._barWidth*this._ratio,this._leftLimit=-this._startX,this._rightLimit=this._barWidth-this._startX,this._initialValue=this.value}_trackX(t){const e=Math.min(this._rightLimit,Math.max(this._leftLimit,t.detail.dx)),i=this._startX+e,s=(this.max-this.min)*i/this._barWidth+this.min,a=this._calcStep(s);a!==this.value&&(this.value=a,this._fireEvent("input"))}_trackEnd(){this.value!==this._initialValue&&this._fireEvent("change")}_barClick(t){if(!this.disabled&&!this.readonly){const e=this._bar.getBoundingClientRect(),i=this._knob.offsetWidth,s=this._bar.offsetWidth-i,a=t.clientX-e.left-i/2,n=(this.max-this.min)*a/s+this.min,r=this._calcStep(n);r!==this.value&&(this.value=r,this._fireEvent("input"),this._fireEvent("change"))}}_fireEvent(t){this.dispatchEvent(new CustomEvent(t,{bubbles:!0}))}_fireChanges(t){this.value!==t&&(this._fireEvent("input"),this._fireEvent("change"))}}export{l as B};
