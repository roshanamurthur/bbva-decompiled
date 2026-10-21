import{z as o,aS as a,an as r,aN as t,bx as e,ak as i,h as n,i as l,aV as s,L as c,bJ as b,bK as m,av as v}from"./952f98a9.js";import{R as d,S as f,u as h,T as g,D as u,a1 as y,w as p,v as _,G as k,a2 as $,x as S,z as x,A as w,W as A,H as L,F as B}from"./216055dc.js";import{B as M}from"./afb1d3bc.js";var P=o`
:host {
  --_form-range-knob-color:
  var(--bbva-form-range--_ambient--knob-color,
    var(--bbva-form-range--custom--primary-ambient--knob-color,
      ${d("colorPrimaryCtaMainBackgroundDefault",f)}));
  --_form-range-bar-color:
  var(--bbva-form-range--_ambient--bar-color,
      var(--bbva-form-range--custom--primary-ambient--bar-color,
      ${d("colorPrimaryProcessPending",f)}));
  --_form-range-active-bar-color:
  var(--bbva-form-range--_ambient--active-bar-color,
      var(--bbva-form-range--custom--primary-ambient--active-bar-color,
      ${d("colorPrimarySelectionInteraction02Selected",f)}));
  --_form-range-knob-border-color:
  var(--bbva-form-range--_ambient--knob-border-color,
    var(--bbva-form-range--custom--primary-ambient--knob-border-color,
      ${d("colorPrimarySurfaceAmbientDefault",f)}));
  --_form-range-knob-icon-color:
  var(--bbva-form-range--_ambient--knob-icon-color,
      var(--bbva-form-range--custom--primary-ambient--knob-icon-color,
      ${d("colorPrimaryCtaMainTextDefault",f)}));
  --_form-range-knob-border-color:
  var(--bbva-form-range--_ambient--knob-border-color,
      var(--bbva-form-range--custom--primary-ambient--knob-border-color,
      ${d("colorPrimarySurfaceAmbientDefault",f)}));
  --_form-range-icon-color:
  var(--bbva-form-range--_ambient--icon-color,
      var(--bbva-form-range--custom--primary-ambient--icon-color,
      ${d("colorPrimaryLinkMainDefault",f)}));
  --_form-range-readonly-active-bar-color:
  var(--bbva-form-range--_ambient--readonly-active-bar-color,
      var(--bbva-form-range--custom--primary-ambient--readonly-active-bar-color,
      ${d("colorPrimaryRiskLevelFour",f)}));
  --_form-range-readonly-knob-color:
  var(--bbva-form-range--_ambient--readonly-knob-color,
      var(--bbva-form-range--custom--primary-ambient--readonly-knob-color,
      ${d("colorPrimaryCtaMainBackgroundDefault",f)}));
  --_form-range-readonly-icon-color:
  var(--bbva-form-range--_ambient--readonly-icon-color,
      var(--bbva-form-range--custom--primary-ambient--readonly-icon-color,
      ${d("colorPrimaryCtaMainTextDefault",f)}));
  --_form-range-section-color-1:
  var(--bbva-form-range--_ambient--section-color-1,
      var(--bbva-form-range--custom--primary-ambient--section-color-1,
      ${d("colorPrimaryRiskLevelOne",f)}));
  --_form-range-section-color-2:
  var(--bbva-form-range--_ambient--section-color-2,
      var(--bbva-form-range--custom--primary-ambient--section-color-2,
      ${d("colorPrimaryRiskLevelTwo",f)}));
  --_form-range-section-color-3:
  var(--bbva-form-range--_ambient--section-color-3,
      var(--bbva-form-range--custom--primary-ambient--section-color-3,
      ${d("colorPrimaryRiskLevelThree",f)}));
  --_form-range-section-color-4:
  var(--bbva-form-range--_ambient--section-color-4,
      var(--bbva-form-range--custom--primary-ambient--section-color-4,
      ${d("colorPrimaryRiskLevelFour",f)}));
  --_form-range-section-color-5:
  var(--bbva-form-range--_ambient--section-color-5,
      var(--bbva-form-range--custom--primary-ambient--section-color-5,
      ${d("colorPrimaryRiskLevelFive",f)}));
  --_form-range-knob-focus-color:
  var(--bbva-form-range--_ambient--knob-focus-color,
    var(--bbva-form-range--custom--primary-ambient--knob-focus-color,
      ${d("colorPrimarySurfaceAmbientFocus",f)}));
}
`;const C=o`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-range--_ambient--bar-color: initial;
    --bbva-form-range--_ambient--active-bar-color: initial;
    --bbva-form-range--_ambient--knob-color: initial;
    --bbva-form-range--_ambient--knob-icon-color: initial;
    --bbva-form-range--_ambient--knob-border-color: initial;
    --bbva-form-range--_ambient--icon-color: initial;
    --bbva-form-range--_ambient--readonly-active-bar-color: initial;
    --bbva-form-range--_ambient--readonly-knob-color: initial;
    --bbva-form-range--_ambient--readonly-icon-color: initial;
    --bbva-form-range--_ambient--knob-color: initial;
    --bbva-form-range--_ambient--section-color-1: initial;
    --bbva-form-range--_ambient--section-color-2: initial;
    --bbva-form-range--_ambient--section-color-3: initial;
    --bbva-form-range--_ambient--section-color-4: initial;
    --bbva-form-range--_ambient--section-color-5: initial;
    --bbva-form-range--_ambient--knob-focus-color: initial;
  }
`,T=o`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-range--_ambient--bar-color: var(
      --bbva-form-range--custom--primary-alt-ambient--bar-color,
      ${d("colorPrimaryAltProcessPending",f)}
    );

    --bbva-form-range--_ambient--active-bar-color: var(
      --bbva-form-range--custom--primary-alt-ambient--active-bar-color,
      ${d("colorPrimaryAltSelectionInteraction02Selected",f)}
    );

    --bbva-form-range--_ambient--knob-color: var(
      --bbva-form-range--custom--primary-alt-ambient--knob-color,
      ${d("colorPrimaryAltCtaMainBackgroundDefault",f)}
    );

    --bbva-form-range--_ambient--knob-icon-color: var(
      --bbva-form-range--custom--primary-alt-ambient--knob-icon-color,
      ${d("colorPrimaryAltCtaMainTextDefault",f)}
    );

    --bbva-form-range--_ambient--knob-border-color: var(
      --bbva-form-range--custom--primary-alt-ambient--knob-border-color,
      ${d("colorPrimaryAltSurfaceAmbientDefault",f)}
    );

    --bbva-form-range--_ambient--icon-color: var(
      --bbva-form-range--custom--primary-alt-ambient--icon-color,
      ${d("colorPrimaryAltLinkMainDefault",f)}
    );

    --bbva-form-range--_ambient--readonly-active-bar-color: var(
      --bbva-form-range--custom--primary-alt-ambient--readonly-active-bar-color,
      ${d("colorPrimaryAltRiskLevelFour",f)}
    );

    --bbva-form-range--_ambient--readonly-knob-color: var(
      --bbva-form-range--custom--primary-alt-ambient--readonly-knob-color,
      ${d("colorPrimaryAltCtaMainBackgroundDefault",f)}
    );

    --bbva-form-range--_ambient--readonly-icon-color: var(
      --bbva-form-range--custom--primary-alt-ambient--readonly-icon-color,
      ${d("colorPrimaryAltCtaMainTextDefault",f)}
    );

    --bbva-form-range--_ambient--knob-color: var(
      --bbva-form-range--custom--primary-alt-ambient--knob-color,
      ${d("colorPrimaryAltCtaMainBackgroundDefault",f)}
    );

    --bbva-form-range--_ambient--section-color-1: var(
      --bbva-form-range--custom--primary-alt-ambient--section-color-1,
      ${d("colorPrimaryAltRiskLevelOne",f)}
    );

    --bbva-form-range--_ambient--section-color-2: var(
      --bbva-form-range--custom--primary-alt-ambient--section-color-2,
      ${d("colorPrimaryAltRiskLevelTwo",f)}
    );

    --bbva-form-range--_ambient--section-color-3: var(
      --bbva-form-range--custom--primary-alt-ambient--section-color-3,
      ${d("colorPrimaryAltRiskLevelThree",f)}
    );

    --bbva-form-range--_ambient--section-color-4: var(
      --bbva-form-range--custom--primary-alt-ambient--section-color-4,
      ${d("colorPrimaryAltRiskLevelFour",f)}
    );

    --bbva-form-range--_ambient--section-color-5: var(
      --bbva-form-range--custom--primary-alt-ambient--section-color-5,
      ${d("colorPrimaryAltRiskLevelFive",f)}
    );
    
    --bbva-form-range--_ambient--knob-focus-color: var(
      --bbva-form-range--custom--primary-alt-ambient--knob-focus-color,
      ${d("colorPrimaryAltSurfaceAmbientFocus",f)});
  }
`,R=o`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-range--_ambient--bar-color: var(
      --bbva-form-range--custom--secondary-ambient--bar-color,
      ${d("colorSecondaryProcessPending",f)}
    );

    --bbva-form-range--_ambient--active-bar-color: var(
      --bbva-form-range--custom--secondary-ambient--active-bar-color,
      ${d("colorSecondarySelectionInteraction02Selected",f)}
    );

    --bbva-form-range--_ambient--knob-color: var(
      --bbva-form-range--custom--secondary-ambient--knob-color,
      ${d("colorSecondaryCtaMainBackgroundDefault",f)}
    );

    --bbva-form-range--_ambient--knob-icon-color: var(
      --bbva-form-range--custom--secondary-ambient--knob-icon-color,
      ${d("colorSecondaryCtaMainTextDefault",f)}
    );

    --bbva-form-range--_ambient--knob-border-color: var(
      --bbva-form-range--custom--secondary-ambient--knob-border-color,
      ${d("colorSecondarySurfaceAmbientDefault",f)}
    );

    --bbva-form-range--_ambient--icon-color: var(
      --bbva-form-range--custom--secondary-ambient--icon-color,
      ${d("colorSecondaryLinkMainDefault",f)}
    );

    --bbva-form-range--_ambient--readonly-active-bar-color: var(
      --bbva-form-range--custom--secondary-ambient--readonly-active-bar-color,
      ${d("colorSecondaryRiskLevelFour",f)}
    );

    --bbva-form-range--_ambient--readonly-knob-color: var(
      --bbva-form-range--custom--secondary-ambient--readonly-knob-color,
      ${d("colorSecondaryCtaMainBackgroundDefault",f)}
    );

    --bbva-form-range--_ambient--readonly-icon-color: var(
      --bbva-form-range--custom--secondary-ambient--readonly-icon-color,
      ${d("colorSecondaryCtaMainTextDefault",f)}
    );

    --bbva-form-range--_ambient--knob-color: var(
      --bbva-form-range--custom--secondary-ambient--knob-color,
      ${d("colorSecondaryCtaMainBackgroundDefault",f)}
    );

    --bbva-form-range--_ambient--section-color-1: var(
      --bbva-form-range--custom--secondary-ambient--section-color-1,
      ${d("colorSecondaryRiskLevelOne",f)}
    );

    --bbva-form-range--_ambient--section-color-2: var(
      --bbva-form-range--custom--secondary-ambient--section-color-2,
      ${d("colorSecondaryRiskLevelTwo",f)}
    );

    --bbva-form-range--_ambient--section-color-3: var(
      --bbva-form-range--custom--secondary-ambient--section-color-3,
      ${d("colorSecondaryRiskLevelThree",f)}
    );

    --bbva-form-range--_ambient--section-color-4: var(
      --bbva-form-range--custom--secondary-ambient--section-color-4,
      ${d("colorSecondaryRiskLevelFour",f)}
    );

    --bbva-form-range--_ambient--section-color-5: var(
      --bbva-form-range--custom--secondary-ambient--section-color-5,
      ${d("colorSecondaryRiskLevelFive",f)}
    );

    --bbva-form-range--_ambient--knob-focus-color: var(
      --bbva-form-range--custom--secondary-ambient--knob-focus-color,
      ${d("colorSecondarySurfaceAmbientFocus",f)});
  }
`,D=o`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-range--_ambient--bar-color: var(
      --bbva-form-range--custom--secondary-alt-ambient--bar-color,
      ${d("colorSecondaryAltProcessPending",f)}
    );

    --bbva-form-range--_ambient--active-bar-color: var(
      --bbva-form-range--custom--secondary-alt-ambient--active-bar-color,
      ${d("colorSecondaryAltSelectionInteraction02Selected",f)}
    );

    --bbva-form-range--_ambient--knob-color: var(
      --bbva-form-range--custom--secondary-alt-ambient--knob-color,
      ${d("colorSecondaryAltCtaMainBackgroundDefault",f)}
    );

    --bbva-form-range--_ambient--knob-icon-color: var(
      --bbva-form-range--custom--secondary-alt-ambient--knob-icon-color,
      ${d("colorSecondaryAltCtaMainTextDefault",f)}
    );

    --bbva-form-range--_ambient--knob-border-color: var(
      --bbva-form-range--custom--secondary-alt-ambient--knob-border-color,
      ${d("colorSecondaryAltSurfaceAmbientDefault",f)}
    );

    --bbva-form-range--_ambient--icon-color: var(
      --bbva-form-range--custom--secondary-alt-ambient--icon-color,
      ${d("colorSecondaryAltLinkMainDefault",f)}
    );

    --bbva-form-range--_ambient--readonly-active-bar-color: var(
      --bbva-form-range--custom--secondary-alt-ambient--readonly-active-bar-color,
      ${d("colorSecondaryAltRiskLevelFour",f)}
    );

    --bbva-form-range--_ambient--readonly-knob-color: var(
      --bbva-form-range--custom--secondary-alt-ambient--readonly-knob-color,
      ${d("colorSecondaryAltCtaMainBackgroundDefault",f)}
    );

    --bbva-form-range--_ambient--readonly-icon-color: var(
      --bbva-form-range--custom--secondary-alt-ambient--readonly-icon-color,
      ${d("colorSecondaryAltCtaMainTextDefault",f)}
    );

    --bbva-form-range--_ambient--knob-color: var(
      --bbva-form-range--custom--secondary-alt-ambient--knob-color,
      ${d("colorSecondaryAltCtaMainBackgroundDefault",f)}
    );

    --bbva-form-range--_ambient--section-color-1: var(
      --bbva-form-range--custom--secondary-alt-ambient--section-color-1,
      ${d("colorSecondaryAltRiskLevelOne",f)}
    );

    --bbva-form-range--_ambient--section-color-2: var(
      --bbva-form-range--custom--secondary-alt-ambient--section-color-2,
      ${d("colorSecondaryAltRiskLevelTwo",f)}
    );

    --bbva-form-range--_ambient--section-color-3: var(
      --bbva-form-range--custom--secondary-alt-ambient--section-color-3,
      ${d("colorSecondaryAltRiskLevelThree",f)}
    );

    --bbva-form-range--_ambient--section-color-4: var(
      --bbva-form-range--custom--secondary-alt-ambient--section-color-4,
      ${d("colorSecondaryAltRiskLevelFour",f)}
    );

    --bbva-form-range--_ambient--section-color-5: var(
      --bbva-form-range--custom--secondary-alt-ambient--section-color-5,
      ${d("colorSecondaryAltRiskLevelFive",f)}
    );

    --bbva-form-range--_ambient--knob-focus-color: var(
      --bbva-form-range--custom--secondary-ambient--knob-focus-color,
      ${d("colorSecondarySurfaceAmbientFocus",f)});
  }
`;const F=h([Object.freeze({__proto__:null,primary:C,primaryAlt:T,secondary:R,secondaryAlt:D}),g,u,y]),z=Object.values(F);var H=o`
:host {
  --_form-range-knob-width: var(--bbva-form-range-knob-size, var(--bbva-form-range-knob-width, 2rem));
  --_form-range-knob-height: var(--bbva-form-range-knob-size, var(--bbva-form-range-knob-height, 2rem));
  --_form-range-bar-height: var(--bbva-form-range-bar-height, 0.25rem);
  --_form-range-current-width: calc(100% - var(--_form-range-knob-width));
  --_form-range-bar-opacity: var(--bbva-form-range-bar-opacity, 1);
  --_form-range-knob-icon-opacity: var(--bbva-form-range-knob-icon-opacity, 1);
  position: relative;
  display: block;
  box-sizing: border-box;
  outline: none;
}
:host button {
  padding: 0;
  border: 0;
  background: none;
  color: inherit;
  outline: none;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*::after {
  box-sizing: inherit;
}

.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

.content {
  display: flex;
  margin-top: 1rem;
}

:host([variant=informational-slider]) .content {
  margin-top: 1.5rem;
}

.control {
  position: relative;
  flex: auto;
}

.container {
  position: relative;
  display: flex;
  justify-content: center;
}

.informational-title {
  display: flex;
  flex-direction: column;
  align-content: center;
}
:host([amount-first]) .informational-title {
  flex-direction: column-reverse;
}

.amount {
  align-self: center;
}

.section {
  position: relative;
  height: var(--_form-range-bar-height);
  flex: 1;
  border-radius: 0.625rem;
  margin: 0 0.125rem;
  background-color: var(--_form-range-bar-color);
  opacity: var(--_form-range-bar-opacity);
}
.section.marked {
  background-color: var(--_form-range-active-bar-color);
  opacity: 1;
}
:host([variant=informational-section]) .section.marked:nth-child(1) {
  background-color: var(--_form-range-section-color-1);
}
:host([variant=informational-section]) .section.marked:nth-child(2), .t4 :host([variant=informational-section]) .section.marked:nth-child(1), .t3 :host([variant=informational-section]) .section.marked:nth-child(1) {
  background-color: var(--_form-range-section-color-2);
}
:host([variant=informational-section]) .section.marked:nth-child(3), .t4 :host([variant=informational-section]) .section.marked:nth-child(2), .t3 :host([variant=informational-section]) .section.marked:nth-child(2), .t2 :host([variant=informational-section]) .section.marked:nth-child(2) {
  background-color: var(--_form-range-section-color-3);
}
:host([variant=informational-section]) .section.marked:nth-child(4), .t4 :host([variant=informational-section]) .section.marked:nth-child(3), .t3 :host([variant=informational-section]) .section.marked:nth-child(3), .t2 :host([variant=informational-section]) .section.marked:nth-child(1) {
  background-color: var(--_form-range-section-color-4);
}
:host([variant=informational-section]) .section.marked:nth-child(5), .t4 :host([variant=informational-section]) .section.marked:nth-child(4) {
  background-color: var(--_form-range-section-color-5);
}

.sections-wrap {
  position: absolute;
  top: 50%;
  right: 0;
  left: 0;
  display: flex;
  height: var(--_form-range-bar-height);
  align-items: center;
  transform: translateY(-50%);
  transform-origin: top right;
}

.bar {
  position: absolute;
  top: 50%;
  left: 0;
  display: flex;
  overflow: hidden;
  width: 100%;
  height: var(--_form-range-bar-height);
  align-items: center;
  border-bottom-right-radius: 0.625rem;
  border-top-right-radius: 0.625rem;
  transform: translateY(-50%);
}
.bar-background {
  width: 100%;
  height: var(--_form-range-bar-height);
  background-color: var(--_form-range-bar-color);
}
.bar-filled {
  position: absolute;
  right: 100%;
  width: calc(100% - var(--_form-range-knob-width));
  height: var(--_form-range-bar-height);
  background-color: var(--_form-range-active-bar-color);
}
:host([readonly]) .bar-filled {
  background-color: var(--_form-range-readonly-active-bar-color);
}
:host([variant=informational-slider]) .bar-filled {
  transition: color 0.3s;
}
:host([variant=informational-slider]) .bar-filled.s1 {
  background-color: var(--_form-range-section-color-1);
}
:host([variant=informational-slider]) .bar-filled.s2 {
  background-color: var(--_form-range-section-color-2);
}
:host([variant=informational-slider]) .bar-filled.s3 {
  background-color: var(--_form-range-section-color-3);
}
:host([variant=informational-slider]) .bar-filled.s4 {
  background-color: var(--_form-range-section-color-4);
}
:host([variant=informational-slider]) .bar-filled.s5 {
  background-color: var(--_form-range-section-color-5);
}

.current {
  position: relative;
  width: var(--_form-range-current-width);
}

.knob {
  position: relative;
  width: var(--_form-range-knob-width);
  height: var(--_form-range-knob-height);
  border: 0.125rem solid var(--_form-range-knob-border-color);
  border-radius: 50%;
  background-color: var(--_form-range-knob-color);
  cursor: pointer;
  transform: translateX(-50%);
}
:host([readonly]) .knob {
  background-color: var(--_form-range-readonly-knob-color);
  cursor: default;
}
:host([focus-visible]) .knob {
  outline: none;
}
.knob-wrapper {
  position: absolute;
  width: 100%;
  height: 100%;
  box-sizing: content-box;
  padding: 0.375rem;
  cursor: pointer;
  transform: translateX(-0.375rem) translateY(-0.375rem);
}
:host([focus-visible]) .knob-wrapper {
  outline: 0.125rem solid var(--_form-range-knob-focus-color);
}
.knob-icon {
  position: absolute;
  top: 50%;
  left: 50%;
  width: 0.125rem;
  height: 0.5rem;
  border-radius: 0.125rem;
  background-color: var(--_form-range-knob-icon-color);
  opacity: var(--_form-range-knob-icon-opacity);
  transform: translate(-50%, -50%);
}
.knob-icon::before {
  position: absolute;
  top: 0;
  right: 0.25rem;
  width: 0.125rem;
  height: 0.5rem;
  border-radius: 0.125rem;
  background-color: inherit;
  content: "";
}
.knob-icon::after {
  position: absolute;
  top: 0;
  left: 0.25rem;
  width: 0.125rem;
  height: 0.5rem;
  border-radius: 0.125rem;
  background-color: inherit;
  content: "";
}

.legend {
  display: flex;
  justify-content: space-between;
  margin: 0.5rem 0 0;
}
.legend-item {
  display: block;
  min-width: var(--_form-range-knob-width);
  text-align: center;
}
`;const V="informational-slider",j="informational-section",I="informational-basic-section";class N extends(p(_(a(r(M))))){static get is(){return"bbva-form-range-controller"}static get scopedElements(){return{"bbva-type-text":k,"bbva-type-amount":$,"bbva-type-icon":S}}static get properties(){return{showLabels:{type:Boolean,attribute:"show-labels"},items:{type:Array},itemLabels:{type:Array},variant:{type:String},informationalTitle:{type:String,attribute:"informational-title"},decimalsHidden:{type:Boolean},amountFirst:{type:Boolean,attribute:"amount-first"},value:{type:Number},symbol:{type:String},amountBold:{type:Boolean,attribute:"amount-bold"},customValue:{type:Boolean,attribute:"custom-value"}}}constructor(){super(),this.showLabels=!1,this.iconError=t(),this.variant="",this.informationalTitle="",this.decimalsHidden=!1,this.amountBold=!1,this.items=[],this.customValue=!1}get _items(){if(this.items)return this.items;const o=Math.round((this.max-this.min)/this.step)+1;return[...Array(o)].map(((o,a)=>Math.ceil(this.min+a*this.step)))}get _percent(){return`${Math.round(100*this._ratio)}%`}get _getCustomValue(){var o;return Number(null===(o=this.items)||void 0===o?void 0:o[this.value/this.step-1])}update(o){if((o.has("min")||o.has("max"))&&(this.variant===j||this.variant===I)){const o=this.max-this.min>=5;this.step=o?(this.max-this.min)/5:1;const a=[...Array(o?4:this.max-this.min-1)].map(((o,a)=>Math.round((a+1)*this.step+this.min)));this.items=[this.min,...a,this.max]}this._items.length>0&&this.setAttribute("aria-label",this._minMaxValues()),super.update(o)}firstUpdated(){var o;null===(o=super.firstUpdated)||void 0===o||o.call(this),0===this.value||this.value||(this.value=this.min)}updated(o){super.updated(o),(o.has("items")||o.has("value"))&&(this.showLabels||this.informationalTitle?this.setAttribute("aria-valuetext",this._valueText()):this.removeAttribute("aria-valuetext"),this.setAttribute("aria-valuenow",this.value))}_valueText(){var o,a;const r=(null===(o=this.itemLabels)||void 0===o?void 0:o[this.value/this.step-1])||(null===(a=this._items)||void 0===a?void 0:a[this.value/this.step-1])||this._value,t=this.informationalTitle?this.value:r;return`\n      ${[this.informationalTitle,this.customValue?this._getCustomValue:t,!this.informationalTitle||this.symbol?this.symbol:this.currencyCode].join(" ")}\n    `}_minMaxValues(){var o,a;const r=null!==(o=this.itemLabels)&&void 0!==o&&o.length?this.itemLabels[0]:this._items[0],t=null!==(a=this.itemLabels)&&void 0!==a&&a.length?this.itemLabels[this.itemLabels.length-1]:this._items[this._items.length-1];return this.t("bbva-form-range-value-min-max",{min:r,max:t})}_calcStep(o){let a=super._calcStep(o);return this.variant!==j&&this.variant!==I||(a=Math.round(a),this.items.includes(a)||(a=this.items.reduce(((o,r)=>Math.abs(r-a)<Math.abs(o-a)?r:o)))),a}static get styles(){return[e(".knob"),super.styles,H,P,z,i("bbva-form-range-controller-shared-styles")]}get _getTitleInformational(){return this.variant&&this.informationalTitle?n`
          <div class="informational-title">
            <bbva-type-text
              unset
              size="${this.amountFirst?"L":"S"}"
              font-weight="${this.amountFirst?"500":"400"}"
              ellipsis
              lines="1"
              text="${this.informationalTitle}"
              alignment="center"
            ></bbva-type-text>
            <bbva-type-amount
              class="amount"
              ?decimals-hidden="${this.decimalsHidden}"
              variant="l"
              .amount="${this.customValue?this._getCustomValue:this.value}"
              .currencyCode="${this.currencyCode}"
              .localCurrency="${this.localCurrency}"
              .language="${this.language}"
              symbol="${l(this.symbol||void 0)}"
              type="${l(this.amountBold?"bold":void 0)}"
            >
            </bbva-type-amount>
          </div>
        `:s}_sectionMarked(o){return o<(this._innerValue-this.min)/this.step}get _sections(){const o=Math.round((this.max-this.min)/this.step);return[...Array(o)]}get _barBlock(){return this.variant===j||this.variant===I?n`
          <div class="bar sections">
            <div class="sections-wrap t${this._sections.length}">
              ${this._sections.map(((o,a)=>n`
                  <div class="section ${this._sectionMarked(a)?"marked":""}"></div>
                `))}
            </div>
          </div>
        `:n`<div class="bar">
          <div class="bar-background" style="transform: translateX(${this._percent});"></div>
          <div
            class="bar-filled ${this.variant===V?this._informationalColorClass:""}"
            style="transform: translateX(${this._percent});"
          ></div>
        </div>`}get _knobContent(){return n` <div class="knob-wrapper"><span class="knob-icon"></span></div> `}get _legendBlock(){return this.showLabels?n`
          <div class="legend">
            ${(this.itemLabels||this._items).map((o=>n`
                <bbva-type-text unset class="legend-item" text="${o}" size="XS"></bbva-type-text>
              `))}
          </div>
        `:n`<div class="legend">
          <bbva-type-text unset alignment="left" text="${this.min}" size="XS"></bbva-type-text>
          <bbva-type-text unset alignment="right" text="${this.max}" size="XS"></bbva-type-text>
        </div> `}get _informationalColorClass(){return this._ratio<.25?"s1":this._ratio<.5?"s2":this._ratio<.75?"s3":this._ratio<1?"s4":"s5"}render(){return n`
      ${this._getTitleInformational}
      <div class="content">
        <div class="control">${this._controlBlock} ${this._legendBlock}</div>
      </div>
      ${this._errorMessage} ${this._input}
    `}}const O=h([x,F,w]),X=Object.values(O);var E=o`
:host .wrapper {
  display: flex;
  overflow: hidden;
  min-height: 7.5rem;
  flex-wrap: wrap;
}
:host .wrapper.desktop {
  min-height: 5.5rem;
}
:host .wrapper-control {
  display: flex;
  min-width: 0;
  flex: auto;
  align-items: center;
  justify-content: center;
}
:host [data-tag-name=bbva-form-range-controller] {
  overflow: hidden;
  width: 100%;
}
:host .icon {
  position: relative;
  top: -0.5rem;
  width: fit-content;
  height: fit-content;
}

[data-tag-name=bbva-notification-help] {
  width: 100%;
  margin-top: 0.5rem;
}

:host([informational-title]) .icon {
  top: 1rem;
}

:host([informational-title][amount-first]) .icon {
  top: 1.25rem;
}

:host([show-icons]) [data-tag-name=bbva-notification-help] {
  margin-left: 2.25rem;
}
`;class Y extends(_(r(A(c)))){static get is(){return"bbva-form-range"}static get scopedElements(){return{"bbva-form-range-controller":N,"bbva-type-link":L,"bbva-notification-help":B}}static get properties(){return{showLabels:{type:Boolean,attribute:"show-labels"},showIcons:{type:Boolean,attribute:"show-icons"},iconSize:{type:Number,attribute:"icon-size"},iconLeft:{type:String,attribute:"icon-left"},iconRight:{type:String,attribute:"icon-right"},items:{type:Array},itemLabels:{type:Array,attribute:"item-labels"},variant:{type:String},informationalTitle:{type:String,attribute:"informational-title"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},amountFirst:{type:Boolean,attribute:"amount-first"},value:{type:Number},readonly:{type:Boolean},max:{type:Number},min:{type:Number},disabled:{type:Boolean},_desktop:{type:Boolean,attribute:!1},step:{type:Number},notificationHelpVariant:{type:String,attribute:"notification-help-variant"},notificationHelpMessage:{type:String,attribute:"notification-help-message"},currencySymbol:{type:String,attribute:"currency-symbol"},amountBold:{type:Boolean,attribute:"amount-bold"},customValue:{type:Boolean,attribute:"custom-value"}}}constructor(){super(),this.showIcons=!1,this.showLabels=!1,this.iconSize=16,this.iconLeft=b(),this.iconRight=m(),this.variant="",this.decimalsHidden=!1,this.readonly=!1,this.disabled=!1,this.step=1,this.notificationHelpVariant="",this.notificationHelpMessage="",this.amountBold=!1,this.customValue=!1}static get styles(){return[E,X,i("bbva-form-range-shared-styles")]}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)"}}_onChange(o){var a,r;this.value=o.target.value;const t=((null===(a=o.target)||void 0===a?void 0:a.itemLabels)||[])[this.value/this.step-1]||((null===(r=o.target)||void 0===r?void 0:r.items)||[])[this.value/this.step-1];this.dispatchEvent(new CustomEvent("form-range-value-change",{bubbles:!0,composed:!0,detail:{value:this.value,label:t}}))}get _slotBefore(){return this.iconLeft&&this.showIcons?n`
          <bbva-type-link
            variant="icon"
            class="icon icon-left"
            icon="${this.iconLeft}"
            size="${this.iconSize}"
            @click=${this._clickSlotBefore}
            ?disabled=${this.disabled}
            aria-label="bbva-form-range-icon-left"
          ></bbva-type-link>
        `:n`<slot name="before"></slot>`}_clickSlotBefore(){this.value=(this.value||0)-this.step}_clickSlotAfter(){this.value=(this.value||0)+this.step}get _slotAfter(){return this.iconRight&&this.showIcons?n`
          <bbva-type-link
            variant="icon"
            class="icon icon-right"
            .icon="${this.iconRight}"
            .size="${this.iconSize}"
            @click=${this._clickSlotAfter}
            ?disabled=${this.disabled}
            aria-label="bbva-form-range-icon-right"
          ></bbva-type-link>
        `:n`<slot name="after"></slot>`}get _notificationHelp(){return this.notificationHelpVariant&&this.notificationHelpMessage?n`
          <bbva-notification-help
            variant="${this.notificationHelpVariant}"
            id="notification"
            accessibility-label-icon="${this.t(`bbva-form-range-notification-help-accessibility-${this.notificationHelpVariant}`)}"
            icon-size="16"
            text="${this.notificationHelpMessage}"
            ?disabled=${this.disabled}
          >
          </bbva-notification-help>
        `:""}render(){return n`
      <div class="wrapper ${v({desktop:this._desktop})}">
        <div class="wrapper-control ">
          ${this._slotBefore}
          <bbva-form-range-controller
            @change="${this._onChange}"
            ?show-labels="${this.showLabels}"
            .items="${this.items}"
            .itemLabels="${this.itemLabels}"
            variant="${this.variant}"
            informational-title="${l(this.informationalTitle)}"
            aria-describedby="${l(this.notificationHelpMessage?"notification":void 0)}"
            ?decimalsHidden="${this.decimalsHidden}"
            ?amount-first=${this.amountFirst}
            .value=${this.value}
            ?readonly="${this.readonly}"
            max="${l(this.max)}"
            min="${l(this.min)}"
            step=${this.step}
            ?disabled=${this.disabled}
            symbol="${l(this.currencySymbol)}"
            ?amount-bold=${this.amountBold}
            ?custom-value=${this.customValue}
          ></bbva-form-range-controller>
          ${this._slotAfter}
        </div>
        ${this._notificationHelp}
      </div>
    `}}export{Y as B,O as b};
