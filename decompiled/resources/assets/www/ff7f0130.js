import{z as o,a8 as r,ab as t,an as a,aM as e,L as n,ak as c,h as i,i as l,aD as b,ac as s,ad as m,by as d,bS as u,bE as g,av as p,cr as v,bp as f}from"./952f98a9.js";import{u as h,z as y,D as _,A as k,v as S,W as $,G as x,H as A,F as C,R as w,S as F,T as P,E as B,x as D,I as E}from"./216055dc.js";var O=o`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.label-out {
  display: flex;
  align-items: end;
  margin-top: 0.5rem;
  margin-bottom: 0.5rem;
  margin-left: 1rem;
}
.label-out [data-tag-name=bbva-type-text] {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${r(t.medium.fontWeight)});
}
.label-out [data-tag-name=bbva-type-link] {
  padding-top: 0;
  padding-right: 1rem;
  padding-bottom: 0.1875rem;
  padding-left: 0.5rem;
}

[data-tag-name=bbva-notification-help] {
  margin-left: 1rem;
}

:host([variant=card]) .label-out {
  margin-bottom: 0.5rem;
  margin-left: 0;
}
:host([variant=card]) [data-tag-name=bbva-notification-help] {
  margin-top: 0.5rem;
  margin-left: 0;
}
`;const z=h([y,_,k]),T=Object.values(z);class H extends(S(a(e($(n))))){static get is(){return"bbva-form-container"}static get scopedElements(){const o=[x,A,C];return H.scopedElementsFromClasses(o)}static get properties(){return{labelOut:{type:String,attribute:"label-out"},labelOutTag:{type:String,attribute:"label-out-tag"},showHelpIcon:{type:Boolean,attribute:"show-help-icon"},linkHref:{type:String,attribute:"link-href"},linkAccessibilityText:{type:String,attribute:"link-accessibility-text"},dividerSize:{type:String,attribute:"divider-size"},_slotContent:{type:Array},invalid:{type:Boolean,reflect:!0},errorText:{type:String,attribute:"error-text"},errorAccessibilityText:{type:String,attribute:"error-accessibility-text"},_desktop:{type:Boolean,attribute:!1}}}constructor(){super(),this.showHelpIcon=!1,this._slotContent=[],this.labelOut="",this.dividerSize="",this.errorText="",this.invalid=!1,this.errorAccessibilityText="",this.linkAccessibilityText="bbva-form-container-link-accessibility-text",this._desktop=!1}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)"}}firstUpdated(){super.firstUpdated(),this.addEventListener("slotschanges",this._slotChanges),this.addEventListener("change",(o=>this._itemChange(o))),this.addEventListener("input",(o=>this._dispatchInput(o)))}static get styles(){return[O,T,c("bbva-form-container-shared-styles")]}_slotChanges(o){const{slotName:r,contentSlots:t}=o.detail;if(this._slotContent=t,"_option"===r){this._includeDivider(),this.invalid=this._isInvalid();this._slotContent.every((o=>{var r;return"radio"===(null===(r=o.assignedNodes)||void 0===r?void 0:r.type)}))&&(this.setAttribute("role","radiogroup"),this.labelOut&&this.setAttribute("aria-labelledby","label-out"))}}_includeDivider(){this._slotContent.forEach(((o,r)=>{const t=o.assignedNodes;t.hasAttribute("divider-size")||r===this._slotContent.length-1||t.setAttribute("divider-size",this.dividerSize)}))}_isInvalid(){return this._slotContent.some((o=>{var r;return null==o||null===(r=o.assignedNodes)||void 0===r?void 0:r.invalid}))}_helpClicked(o){o.stopPropagation(),this.dispatchEvent(new CustomEvent("form-container-help-click",{bubbles:!0,composed:!0}))}get _labelOut(){return i`
      <div class="label-out">
        <bbva-type-text
          id="label-out"
          tag="${l(this.labelOutTag)}"
          unset
          text="${this.labelOut}"
          size="S"
        ></bbva-type-text>

        ${this.showHelpIcon?i`
              <bbva-type-link
                aria-label="${this.t(this.linkAccessibilityText)}"
                icon-size="16"
                @click="${this._helpClicked}"
                href="${l(this.linkHref)}"
                icon="${b()}"
                variant="icon"
              >
              </bbva-type-link>
            `:""}
      </div>
    `}_itemChange(o){const{name:r,value:t,checked:a,type:e}=o.target,n="radio"===e?this.formItems.indexOf(null==o?void 0:o.target):"";this.dispatchEvent(new CustomEvent(`form-container-${this._setAvailableTypes(e)}-change`,{bubbles:!0,composed:!0,detail:{name:r,value:t,checked:a,..."radio"===e&&{selected:n}}}))}_setAvailableTypes(o){return this.types={checkbox:"checkbox",radio:"radio"},this.types[o]||"toggle"}_dispatchInput(o){const{type:r}=o.target;this.dispatchEvent(new CustomEvent(`form-container-${r}-input`,{bubbles:!0,composed:!0}))}get formItems(){var o,r,t;const a=null===(o=(this._slotContent||[])[0])||void 0===o||null===(r=o.assignedNodes)||void 0===r||null===(t=r.constructor)||void 0===t?void 0:t.is;return Array.from(this.querySelectorAll(`[data-tag-name="${a}"]`))}static get _formList(){return i`
      <div class="form-container">
        <slot name="_option"></slot>
      </div>
    `}render(){return i`
      ${this.labelOut?this._labelOut:""} ${H._formList}
      ${this.invalid?i`<bbva-notification-help
            variant="alert"
            text="${this.t(this.errorText)}"
            accessibility-label-icon="${this.t(this.errorAccessibilityText)}"
          ></bbva-notification-help>`:i``}
    `}}var I=o`
:host {
  position: relative;
  display: block;
  width: 100%;
  box-sizing: border-box;
  cursor: pointer;
  font: inherit;
  font-size: var(--typographyTypeSmall, ${r(s.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${r(t.book.fontWeight)});
  line-height: var(--lineHeightTypeSmall, ${r(m.typeSmall)});
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host(:focus) {
  outline: none;
}

:host(:not([focus-visible])) {
  outline: none;
}

*,
*:before,
*:after {
  box-sizing: border-box;
}

:host([focus-visible]) {
  outline: 0.125rem solid var(--_form-control-input-focus-border-color);
  outline-offset: 0.25rem;
}

.container {
  display: flex;
  align-items: var(--bbva-form-control-input-container-align, flex-start);
}

.box {
  display: flex;
  width: 2rem;
  height: 2rem;
  flex: none;
  align-items: center;
  justify-content: center;
  border: 0.125rem solid var(--_form-control-input-border-color);
  margin-top: 1rem;
  margin-right: 0;
  margin-bottom: 1rem;
  margin-left: 1rem;
  background-color: var(--_form-control-input-box-bg-color);
}
.box .check {
  display: block;
  background-color: var(--_form-control-input-check-color);
}
:host([type=radio]) .box .check {
  width: 1rem;
  height: 1rem;
}
:host([type=checkbox]) .box .check {
  background-color: transparent;
  fill: var(--_form-control-input-check-color);
}
:host([aria-checked=true]) :host([type=checkbox]) .box .check, :host([aria-checked=mixed]) :host([type=checkbox]) .box .check {
  opacity: 1;
}

.desktop.container .box {
  width: 1.5rem;
  height: 1.5rem;
  margin-bottom: 1.5rem;
}
:host([type=radio]) .desktop.container .box .check {
  width: 0.75rem;
  height: 0.75rem;
}

:host([alignment=right]) .box {
  margin-right: 1rem;
  margin-left: 0;
}

:host([aria-invalid=true]) .box {
  border-color: var(--_form-control-input-error-color);
  background-color: var(--_form-control-input-error-bg-color);
}
:host([aria-invalid=true]) .box .check {
  background-color: var(--_form-control-input-error-color);
}

:host([aria-invalid=true][type=checkbox]) .check {
  background-color: transparent;
  fill: var(--_form-control-input-error-color);
}

:host([aria-invalid=true][variant=card]) .box {
  background-color: var(--_form-control-input-error-bg-color);
}

:host([active]),
:host(:hover) {
  background-color: var(--_form-control-input-container-pressed-bg-color);
}
:host([active]) .box,
:host(:hover) .box {
  background-color: var(--_form-control-input-pressed-box-bg-color);
}

:host([variant=card]) {
  display: inline-block;
  padding-bottom: 1rem;
  margin: 0;
  background-color: var(--_form-control-input-card-bg-color);
}
:host([variant=card]) .container {
  width: fit-content;
  margin-top: 1rem;
  margin-left: 1rem;
}
:host([variant=card]) .box {
  margin: 0;
  background-color: var(--_form-control-input-card-box-bg-color);
}
:host([variant=card]):host([focus-visible]) {
  outline: none;
}
:host([variant=card]):host([focus-visible]) .container {
  outline: 0.125rem solid var(--_form-control-input-focus-border-color);
  outline-offset: 0.25rem;
}
:host([variant=card]):host([focus-visible]):host([with-contrast][aria-checked=true]) .container {
  outline-color: var(--_form-control-input-focus-border-contrast-color);
}

:host([with-contrast][aria-checked=true]) {
  background-color: var(--_form-control-input-contrast-bg-color);
}
:host([with-contrast][aria-checked=true]) .box {
  border: 0.125rem solid var(--_form-control-input-contrast-border-color);
  background-color: var(--_form-control-input-contrast-box-bg-color);
}
:host([with-contrast][aria-checked=true]) .box .check {
  background-color: var(--_form-control-input-contrast-check-color);
}

:host([variant=card][active]),
:host([variant=card]:hover) {
  background-color: var(--_form-control-input-card-pressed-bg-color);
}
:host([variant=card][active]) .box,
:host([variant=card]:hover) .box {
  background-color: var(--_form-control-input-card-box-pressed-bg-color);
}

:host([variant=card][with-contrast][aria-checked=true]) {
  background-color: var(--_form-control-input-card-contrast-bg-color);
}
:host([variant=card][with-contrast][aria-checked=true]) .box {
  background-color: var(--_form-control-input-card-contrast-box-bg-color);
}

:host([with-contrast][aria-checked=true][type=checkbox]) .check {
  background-color: transparent;
  fill: var(--_form-control-input-contrast-check-color);
}

:host([with-contrast][type=checkbox][aria-checked=true][active]),
:host([with-contrast][type=checkbox][aria-checked=true]:hover) {
  background-color: var(--_form-control-input-contrast-pressed-bg-color);
}

:host([divider-size=fit]) .divider-wrapper {
  padding: 0 1rem;
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

::slotted(*) {
  background: transparent;
}

::slotted([slot=left]), ::slotted([slot=right]) {
  overflow: hidden;
  flex: 1;
}
`,L=o`
:host {
  --_form-control-input-border-color: var(--bbva-form-control-input--_ambient--border-color,
    var(--bbva-form-control-input--custom--primary-ambient--border-color,
      ${w("colorPrimaryFormSelectorBorderDefault",F)}));
  --_form-control-input-box-bg-color: var(--bbva-form-control-input--_ambient--box-bg-color,
    var(--bbva-form-control-input--custom--primary-ambient--box-bg-color,
      ${w("colorPrimaryFormSelectorBackgroundDefault",F)}));
  --_form-control-input-check-color: var(--bbva-form-control-input--_ambient--check-color,
    var(--bbva-form-control-input--custom--primary-ambient--check-color,
      ${w("colorPrimaryFormSelectorCheckDefault",F)}));
  --_form-control-input-container-pressed-bg-color: var(--bbva-form-control-input--_ambient--container-pressed-bg-color,
    var(--bbva-form-control-input--custom--primary-ambient--container-pressed-bg-color,
      ${w("colorPrimarySurfaceAmbientPressed",F)}));
  --_form-control-input-pressed-box-bg-color: var(--bbva-form-control-input--_ambient--pressed-box-bg-color,
    var(--bbva-form-control-input--custom--primary-ambient--pressed-box-bg-color,
      ${w("colorPrimaryFormSelectorBackgroundDefault",F)}));
  --_form-control-input-card-pressed-bg-color: var(--bbva-form-control-input--_ambient--card-pressed-bg-color,
    var(--bbva-form-control-input--custom--primary-ambient--card-pressed-bg-color,
      ${w("colorPrimarySurfaceAlternativePressed",F)}));
  --_form-control-input-card-box-pressed-bg-color: var(--bbva-form-control-input--_ambient--card-box-pressed-bg-color,
    var(--bbva-form-control-input--custom--primary-ambient--card-box-pressed-bg-color,
      ${w("colorPrimaryFormSelectorBackgroundAlternative",F)}));
  --_form-control-input-card-bg-color: var(--bbva-form-control-input--_ambient--card-bg-color,
    var(--bbva-form-control-input--custom--primary-ambient--card-bg-color,
      ${w("colorPrimarySurfaceAlternativeDefault",F)}));
  --_form-control-input-card-box-bg-color: var(--bbva-form-control-input--_ambient--card-box-bg-color,
    var(--bbva-form-control-input--custom--primary-ambient--card-box-bg-color,
      ${w("colorPrimaryFormSelectorBackgroundAlternative",F)}));
  --_form-control-input-card-contrast-bg-color: var(--bbva-form-control-input--_ambient--card-contrast-bg-color,
    var(--bbva-form-control-input--custom--primary-ambient--card-contrast-bg-color,
      ${w("colorPrimarySurfaceContrastDefault",F)}));
  --_form-control-input-card-contrast-box-bg-color: var(--bbva-form-control-input--_ambient--card-contrast-box-bg-color,
    var(--bbva-form-control-input--custom--primary-ambient--card-contrast-box-bg-color,
      ${w("colorPrimaryFormSelectorBackgroundContrast",F)}));
  --_form-control-input-contrast-pressed-bg-color: var(--bbva-form-control-input--_ambient--contrast-pressed-bg-color,
    var(--bbva-form-control-input--custom--primary-ambient--contrast-pressed-bg-color,
      ${w("colorPrimarySurfaceContrastPressed",F)}));
  --_form-control-input-contrast-box-bg-color: var(--bbva-form-control-input--_ambient--contrast-box-bg-color,
    var(--bbva-form-control-input--custom--primary-ambient--contrast-box-bg-color,
      ${w("colorPrimaryFormSelectorBackgroundContrast",F)}));
  --_form-control-input-contrast-border-color: var(--bbva-form-control-input--_ambient--contrast-border-color,
    var(--bbva-form-control-input--custom--primary-ambient--contrast-border-color,
      ${w("colorPrimaryFormSelectorBorderContrast",F)}));
  --_form-control-input-contrast-check-color: var(--bbva-form-control-input--_ambient--contrast-check-color,
    var(--bbva-form-control-input--custom--primary-ambient--contrast-check-color,
      ${w("colorPrimaryFormSelectorCheckContrast",F)}));
  --_form-control-input-contrast-bg-color: var(--bbva-form-control-input--_ambient--contrast-bg-color,
    var(--bbva-form-control-input--custom--primary-ambient--contrast-bg-color,
      ${w("colorPrimarySurfaceContrastDefault",F)}));
  --_form-control-input-error-color: var(--bbva-form-control-input--_ambient--error-color,
    var(--bbva-form-control-input--custom--primary-ambient--error-color,
      ${w("colorPrimaryFormSelectorBorderError",F)}));
  --_form-control-input-error-bg-color: var(--bbva-form-control-input--_ambient--error-bg-color,
    var(--bbva-form-control-input--custom--primary-ambient--error-bg-color,
      ${w("colorPrimaryFormSelectorBackgroundError",F)}));
  --_form-control-input-focus-border-color:var(--bbva-form-control-input--_ambient--focus-border-color,
    var(--bbva-form-control-input--custom--primary-ambient--focus-border-color,
      ${w("colorPrimarySurfaceAmbientFocus",F)}));
  --_form-control-input-focus-border-contrast-color: var(--bbva-form-control-input--_ambient--focus-border-contrast-color,
    var(--bbva-form-control-input--custom--primary-ambient--focus-border-contrast-color,
      ${w("colorPrimarySurfaceContrastFocus",F)}));
}
`;const j=o`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-control-input-ambient-contrast: secondary-alt;
    --bbva-form-control-input-ambient-pressed-contrast: secondary;

    --bbva-form-control-input--_ambient--border-color: initial;
    --bbva-form-control-input--_ambient--box-bg-color: initial;
    --bbva-form-control-input--_ambient--check-color: initial;

    --bbva-form-control-input--_ambient--container-pressed-bg-color: initial;
    --bbva-form-control-input--_ambient--pressed-box-bg-color: initial;

    --bbva-form-control-input--_ambient--card-pressed-bg-color: initial;
    --bbva-form-control-input--_ambient--card-box-pressed-bg-color: initial;
    --bbva-form-control-input--_ambient--card-bg-color: initial;
    --bbva-form-control-input--_ambient--card-box-bg-color: initial;

    --bbva-form-control-input--_ambient--card-contrast-bg-color: initial;
    --bbva-form-control-input--_ambient--card-contrast-box-bg-color: initial;

    --bbva-form-control-input--_ambient--contrast-pressed-bg-color: initial;
    --bbva-form-control-input--_ambient--contrast-box-bg-color: initial;
    --bbva-form-control-input--_ambient--contrast-border-color: initial;
    --bbva-form-control-input--_ambient--contrast-check-color: initial;
    --bbva-form-control-input--_ambient--contrast-bg-color: initial;

    --bbva-form-control-input--_ambient--error-color: initial;
    --bbva-form-control-input--_ambient--error-bg-color: initial;

    --bbva-form-control-input--_ambient--focus-border-color: initial;
    --bbva-form-control-input--_ambient--focus-border-contrast-color: initial;
  }
`,N=o`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-control-input-ambient-contrast: secondary-alt;
    --bbva-form-control-input-ambient-pressed-contrast: secondary;

    --bbva-form-control-input--_ambient--border-color: var(
      --bbva-form-control-input--custom--primary-alt-ambient--border-color,
      ${w("colorPrimaryAltFormSelectorBorderDefault",F)}
    );
    --bbva-form-control-input--_ambient--box-bg-color: var(
      --bbva-form-control-input--custom--primary-alt-ambient--box-bg-color,
      ${w("colorPrimaryAltFormSelectorBackgroundDefault",F)}
    );
    --bbva-form-control-input--_ambient--check-color: var(
      --bbva-form-control-input--custom--primary-alt-ambient--check-color,
      ${w("colorPrimaryAltFormSelectorCheckDefault",F)}
    );

    --bbva-form-control-input--_ambient--container-pressed-bg-color: var(
      --bbva-form-control-input--custom--primary-alt-ambient--container-pressed-bg-color,
      ${w("colorPrimaryAltSurfaceAmbientPressed",F)}
    );
    --bbva-form-control-input--_ambient--pressed-box-bg-color: var(
      --bbva-form-control-input--custom--primary-alt-ambient--pressed-box-bg-color,
      ${w("colorPrimaryAltFormSelectorBackgroundDefault",F)}
    );

    --bbva-form-control-input--_ambient--card-pressed-bg-color: var(
      --bbva-form-control-input--custom--primary-alt-ambient--card-pressed-bg-color,
      ${w("colorPrimaryAltSurfaceAlternativePressed",F)}
    );
    --bbva-form-control-input--_ambient--card-box-pressed-bg-color: var(
      --bbva-form-control-input--custom--primary-alt-ambient--card-box-pressed-bg-color,
      ${w("colorPrimaryAltFormSelectorBackgroundAlternative",F)}
    );
    --bbva-form-control-input--_ambient--card-bg-color: var(
      --bbva-form-control-input--custom--primary-alt-ambient--card-bg-color,
      ${w("colorPrimaryAltSurfaceAlternativeDefault",F)}
    );
    --bbva-form-control-input--_ambient--card-box-bg-color: var(
      --bbva-form-control-input--custom--primary-alt-ambient--card-box-bg-color,
      ${w("colorPrimaryAltFormSelectorBackgroundAlternative",F)}
    );

    --bbva-form-control-input--_ambient--card-contrast-bg-color: var(
      --bbva-form-control-input--custom--primary-alt-ambient--card-contrast-bg-color,
      ${w("colorPrimaryAltSurfaceContrastDefault",F)}
    );
    --bbva-form-control-input--_ambient--card-contrast-box-bg-color: var(
      --bbva-form-control-input--custom--primary-alt-ambient--card-contrast-box-bg-color,
      ${w("colorPrimaryAltFormSelectorBackgroundContrast",F)}
    );

    --bbva-form-control-input--_ambient--contrast-pressed-bg-color: var(
      --bbva-form-control-input--custom--primary-alt-ambient--contrast-pressed-bg-color,
      ${w("colorPrimaryAltSurfaceContrastPressed",F)}
    );
    --bbva-form-control-input--_ambient--contrast-box-bg-color: var(
      --bbva-form-control-input--custom--primary-alt-ambient--contrast-box-bg-color,
      ${w("colorPrimaryAltFormSelectorBackgroundContrast",F)}
    );
    --bbva-form-control-input--_ambient--contrast-border-color: var(
      --bbva-form-control-input--custom--primary-alt-ambient--contrast-border-color,
      ${w("colorPrimaryAltFormSelectorBorderContrast",F)}
    );
    --bbva-form-control-input--_ambient--contrast-check-color: var(
      --bbva-form-control-input--custom--primary-alt-ambient--contrast-check-color,
      ${w("colorPrimaryAltFormSelectorCheckContrast",F)}
    );
    --bbva-form-control-input--_ambient--contrast-bg-color: var(
      --bbva-form-control-input--custom--primary-alt-ambient--contrast-bg-color,
      ${w("colorPrimaryAltSurfaceContrastDefault",F)}
    );

    --bbva-form-control-input--_ambient--error-color: var(
      --bbva-form-control-input--custom--primary-alt-ambient--error-color,
      ${w("colorPrimaryAltFormSelectorBorderError",F)}
    );
    --bbva-form-control-input--_ambient--error-bg-color: var(
      --bbva-form-control-input--custom--primary-alt-ambient--error-bg-color,
      ${w("colorPrimaryAltFormSelectorBackgroundError",F)}
    );
    --bbva-form-control-input--_ambient--focus-border-color: var(
      --bbva-form-control-input--custom--primary-alt-ambient--focus-border-color,
      ${w("colorPrimaryAltSurfaceAmbientFocus",F)}
    );
    --bbva-form-control-input--_ambient--focus-border-contrast-color: var(
      --bbva-form-control-input--custom--primary-alt-ambient--focus-border-contrast-color,
      ${w("colorPrimaryAltSurfaceContrastFocus",F)});
  }
`,W=o`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-control-input-ambient-contrast: primary-alt;
    --bbva-form-control-input-ambient-pressed-contrast: primary;

    --bbva-form-control-input--_ambient--border-color: var(
      --bbva-form-control-input--custom--secondary-ambient--border-color,
      ${w("colorSecondaryFormSelectorBorderDefault",F)}
    );
    --bbva-form-control-input--_ambient--box-bg-color: var(
      --bbva-form-control-input--custom--secondary-ambient--box-bg-color,
      ${w("colorSecondaryFormSelectorBackgroundDefault",F)}
    );
    --bbva-form-control-input--_ambient--check-color: var(
      --bbva-form-control-input--custom--secondary-ambient--check-color,
      ${w("colorSecondaryFormSelectorCheckDefault",F)}
    );

    --bbva-form-control-input--_ambient--container-pressed-bg-color: var(
      --bbva-form-control-input--custom--secondary-ambient--container-pressed-bg-color,
      ${w("colorSecondarySurfaceAmbientPressed",F)}
    );
    --bbva-form-control-input--_ambient--pressed-box-bg-color: var(
      --bbva-form-control-input--custom--secondary-ambient--pressed-box-bg-color,
      ${w("colorSecondaryFormSelectorBackgroundDefault",F)}
    );

    --bbva-form-control-input--_ambient--card-pressed-bg-color: var(
      --bbva-form-control-input--custom--secondary-ambient--card-pressed-bg-color,
      ${w("colorSecondarySurfaceAlternativePressed",F)}
    );
    --bbva-form-control-input--_ambient--card-box-pressed-bg-color: var(
      --bbva-form-control-input--custom--primary-alt-ambient--card-box-pressed-bg-color,
      ${w("colorSecondaryFormSelectorBackgroundAlternative",F)}
    );
    --bbva-form-control-input--_ambient--card-bg-color: var(
      --bbva-form-control-input--custom--secondary-ambient--card-bg-color,
      ${w("colorSecondarySurfaceAlternativeDefault",F)}
    );
    --bbva-form-control-input--_ambient--card-box-bg-color: var(
      --bbva-form-control-input--custom--secondary-ambient--card-box-bg-color,
      ${w("colorSecondaryFormSelectorBackgroundAlternative",F)}
    );

    --bbva-form-control-input--_ambient--card-contrast-bg-color: var(
      --bbva-form-control-input--custom--secondary-ambient--card-contrast-bg-color,
      ${w("colorSecondarySurfaceContrastDefault",F)}
    );
    --bbva-form-control-input--_ambient--card-contrast-box-bg-color: var(
      --bbva-form-control-input--custom--secondary-ambient--card-contrast-box-bg-color,
      ${w("colorSecondaryFormSelectorBackgroundContrast",F)}
    );

    --bbva-form-control-input--_ambient--contrast-pressed-bg-color: var(
      --bbva-form-control-input--custom--secondary-ambient--contrast-pressed-bg-color,
      ${w("colorSecondarySurfaceContrastPressed",F)}
    );
    --bbva-form-control-input--_ambient--contrast-box-bg-color: var(
      --bbva-form-control-input--custom--secondary-ambient--contrast-box-bg-color,
      ${w("colorSecondaryFormSelectorBackgroundContrast",F)}
    );
    --bbva-form-control-input--_ambient--contrast-border-color: var(
      --bbva-form-control-input--custom--secondary-ambient--contrast-border-color,
      ${w("colorSecondaryFormSelectorBorderContrast",F)}
    );
    --bbva-form-control-input--_ambient--contrast-check-color: var(
      --bbva-form-control-input--custom--secondary-ambient--contrast-check-color,
      ${w("colorSecondaryFormSelectorCheckContrast",F)}
    );
    --bbva-form-control-input--_ambient--contrast-bg-color: var(
      --bbva-form-control-input--custom--secondary-ambient--contrast-bg-color,
      ${w("colorSecondarySurfaceContrastDefault",F)}
    );

    --bbva-form-control-input--_ambient--error-color: var(
      --bbva-form-control-input--custom--secondary-ambient--error-color,
      ${w("colorSecondaryFormSelectorBorderError",F)}
    );
    --bbva-form-control-input--_ambient--error-bg-color: var(
      --bbva-form-control-input--custom--secondary-ambient--error-bg-color,
      ${w("colorSecondaryFormSelectorBackgroundError",F)}
    );
    --bbva-form-control-input--_ambient--focus-border-color: var(
      --bbva-form-control-input--custom--secondary-ambient--focus-border-color,
      ${w("colorSecondarySurfaceAmbientFocus",F)}
    );
    --bbva-form-control-input--_ambient--focus-border-contrast-color: var(
      --bbva-form-control-input--custom--secondary-ambient--focus-border-contrast-color,
      ${w("colorSecondarySurfaceContrastFocus",F)});
  }
`,M=o`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-control-input-ambient-contrast: primary-alt;
    --bbva-form-control-input-ambient-pressed-contrast: primary;

    --bbva-form-control-input--_ambient--border-color: var(
      --bbva-form-control-input--custom--secondary-alt-ambient--border-color,
      ${w("colorSecondaryAltFormSelectorBorderDefault",F)}
    );
    --bbva-form-control-input--_ambient--box-bg-color: var(
      --bbva-form-control-input--custom--secondary-alt-ambient--box-bg-color,
      ${w("colorSecondaryAltFormSelectorBackgroundDefault",F)}
    );
    --bbva-form-control-input--_ambient--check-color: var(
      --bbva-form-control-input--custom--secondary-alt-ambient--check-color,
      ${w("colorSecondaryAltFormSelectorCheckDefault",F)}
    );

    --bbva-form-control-input--_ambient--container-pressed-bg-color: var(
      --bbva-form-control-input--custom--secondary-alt-ambient--container-pressed-bg-color,
      ${w("colorSecondaryAltSurfaceAmbientPressed",F)}
    );
    --bbva-form-control-input--_ambient--pressed-box-bg-color: var(
      --bbva-form-control-input--custom--secondary-alt-ambient--pressed-box-bg-color,
      ${w("colorSecondaryAltFormSelectorBackgroundDefault",F)}
    );

    --bbva-form-control-input--_ambient--card-pressed-bg-color: var(
      --bbva-form-control-input--custom--secondary-alt-ambient--card-pressed-bg-color,
      ${w("colorSecondaryAltSurfaceAlternativePressed",F)}
    );
    --bbva-form-control-input--_ambient--card-box-pressed-bg-color: var(
      --bbva-form-control-input--custom--secondary-alt-ambient--card-box-pressed-bg-color,
      ${w("colorSecondaryAltFormSelectorBackgroundAlternative",F)}
    );
    --bbva-form-control-input--_ambient--card-bg-color: var(
      --bbva-form-control-input--custom--secondary-alt-ambient--card-bg-color,
      ${w("colorSecondaryAltSurfaceAlternativeDefault",F)}
    );
    --bbva-form-control-input--_ambient--card-box-bg-color: var(
      --bbva-form-control-input--custom--secondary-alt-ambient--card-box-bg-color,
      ${w("colorSecondaryAltFormSelectorBackgroundAlternative",F)}
    );

    --bbva-form-control-input--_ambient--card-contrast-bg-color: var(
      --bbva-form-control-input--custom--secondary-alt-ambient--card-contrast-bg-color,
      ${w("colorSecondaryAltSurfaceContrastDefault",F)}
    );
    --bbva-form-control-input--_ambient--card-contrast-box-bg-color: var(
      --bbva-form-control-input--custom--secondary-alt-ambient--card-contrast-box-bg-color,
      ${w("colorSecondaryAltFormSelectorBackgroundContrast",F)}
    );

    --bbva-form-control-input--_ambient--contrast-pressed-bg-color: var(
      --bbva-form-control-input--custom--secondary-alt-ambient--contrast-pressed-bg-color,
      ${w("colorSecondaryAltSurfaceContrastPressed",F)}
    );
    --bbva-form-control-input--_ambient--contrast-box-bg-color: var(
      --bbva-form-control-input--custom--secondary-alt-ambient--contrast-box-bg-color,
      ${w("colorSecondaryAltFormSelectorBackgroundContrast",F)}
    );
    --bbva-form-control-input--_ambient--contrast-border-color: var(
      --bbva-form-control-input--custom--secondary-alt-ambient--contrast-border-color,
      ${w("colorSecondaryAltFormSelectorBorderContrast",F)}
    );
    --bbva-form-control-input--_ambient--contrast-check-color: var(
      --bbva-form-control-input--custom--secondary-alt-ambient--contrast-check-color,
      ${w("colorSecondaryAltFormSelectorCheckContrast",F)}
    );
    --bbva-form-control-input--_ambient--contrast-bg-color: var(
      --bbva-form-control-input--custom--secondary-alt-ambient--contrast-bg-color,
      ${w("colorSecondaryAltSurfaceContrastDefault",F)}
    );

    --bbva-form-control-input--_ambient--error-color: var(
      --bbva-form-control-input--custom--secondary-alt-ambient--error-color,
      ${w("colorSecondaryAltFormSelectorBorderError",F)}
    );
    --bbva-form-control-input--_ambient--error-bg-color: var(
      --bbva-form-control-input--custom--secondary-alt-ambient--error-bg-color,
      ${w("colorSecondaryAltFormSelectorBackgroundError",F)}
    );
    --bbva-form-control-input--_ambient--focus-border-color: var(
      --bbva-form-control-input--custom--secondary-alt-ambient--focus-border-color,
      ${w("colorSecondaryAltSurfaceAmbientFocus",F)}
    );
    --bbva-form-control-input--_ambient--focus-border-contrast-color: var(
      --bbva-form-control-input--custom--secondary-alt-ambient--focus-border-contrast-color,
      ${w("colorSecondaryAltSurfaceContrastFocus",F)});
  }
`;const Q=h([Object.freeze({__proto__:null,primary:j,primaryAlt:N,secondary:W,secondaryAlt:M}),P,B]),U=Object.values(Q);class V extends(S(e(a($(d))))){static get is(){return"bbva-form-control-input"}static get scopedElements(){const o=[D,E];return V.scopedElementsFromClasses(o)}static get properties(){return{variant:{type:String},alignment:{type:String,reflect:!0},checkIcon:{type:String,attribute:"check-icon"},indeterminateIcon:{type:String,attribute:"indeterminate-icon"},withContrast:{type:Boolean,attribute:"with-contrast"},dividerSize:{type:String,attribute:"divider-size"},_slotContent:{type:Array},invalid:{type:Boolean,reflect:!0},_desktop:{type:Boolean,attribute:!1},verticalAlignTop:{type:Boolean,attribute:"vertical-align-top"}}}constructor(){super(),this.variant="",this.alignment="left",this.checkIcon=u(),this.indeterminateIcon=g(),this.withContrast=!1,this.dividerSize="",this._slotContent=[],this.invalid=!1,this.addEventListener("slotschanges",this._slotChanges),this.addEventListener("mousedown",this._updateColors),this.addEventListener("touchstart",this._updateColors),this.verticalAlignTop=!1}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)"}}_slotChanges(o){const{slotName:r,contentSlots:t}=o.detail;["right","left","bottom"].includes(r)&&t.length&&(this._slotContent=Array.from(t))}_updateColors(){this.active&&"checkbox"===this.type&&this._changeAmbient("--bbva-form-control-input-ambient-pressed-contrast","secondary")}static get styles(){return[super.styles,I,L,U,c("bbva-form-toggle-option-shared-styles")]}updated(o){super.updated&&super.updated(o),this._slotContent.length&&this._changeAmbient("--bbva-form-control-input-ambient-contrast","secondary-alt"),o.has("invalid")&&this.setAttribute("aria-invalid",this.invalid.toString()),1!==this._countChildren()||this.verticalAlignTop||this.style.setProperty("--bbva-form-control-input-container-align","center")}_changeAmbient(o,r){this._slotContent.forEach((t=>{const a=t.assignedNodes;let e="";if(this.checked&&this.withContrast){e=window.getComputedStyle(document.body).getPropertyValue(o).trim()||r}a.setAttribute("ambient",e)}))}_countChildren(){var o;return null===(o=this._slotContent[0])||void 0===o?void 0:o.assignedNodes.children.length}get _checkIcon(){return this.indeterminate?this.indeterminateIcon:this.checkIcon}get _inputTemplate(){return"checkbox"===this.type?i`
          <slot name="input-template">
            <span class="box">
              <bbva-type-icon
                class="check"
                .icon="${this._checkIcon}"
                size=${this._desktop?"16":"24"}
              ></bbva-type-icon>
            </span>
          </slot>
        `:super._inputTemplate}get _labelledInput(){return i`
      <div class="container ${p({desktop:this._desktop})}">
        <slot name="left"></slot>
        ${this._inputTemplate} ${this._labelTemplate}
        <slot name="right"></slot>
      </div>
      <slot name="bottom"></slot>
    `}render(){return i`
      ${this._labelledInput} ${this._control}
      ${this.dividerSize?i`<div class="divider-wrapper">
            <bbva-divider-default size="full"></bbva-divider-default>
          </div>`:i``}
    `}}var X=o`
:host {
  position: relative;
  display: block;
  width: 100%;
  box-sizing: border-box;
  cursor: pointer;
  font: inherit;
  font-size: var(--typographyTypeSmall, ${r(s.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${r(t.book.fontWeight)});
  line-height: var(--lineHeightTypeSmall, ${r(m.typeSmall)});
  --_form-toggle-input-knob-tie-width: var(--bbva-form-toggle-input-tie-width, 1.375rem);
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host(:focus) {
  outline: none;
}

*,
*:before,
*:after {
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

:host([focus-visible]) {
  outline: 0.125rem solid var(--_form-toggle-input-focus-border-color);
  outline-offset: 0.25rem;
}

.container {
  display: flex;
  align-items: var(--bbva-form-control-input-container-align, flex-start);
}
:host([alignment=right]) .container {
  justify-content: space-between;
}

.bg {
  position: relative;
  display: flex;
  overflow: hidden;
  width: 2.5rem;
  height: 1.5rem;
  flex: none;
  flex-wrap: nowrap;
  justify-content: space-between;
  border-radius: 0.8125rem;
  margin-top: 1rem;
  margin-bottom: 1rem;
  margin-left: 1rem;
  background-color: var(--_form-toggle-input-control-color);
}
:host([checked]) .bg {
  background-color: var(--_form-toggle-input-control-checked-color);
}
:host([alignment=right]) .bg {
  margin-right: 1rem;
  margin-left: 0;
}

.knob {
  position: absolute;
  top: 0.0625rem;
  right: 0.0625rem;
  bottom: 0.0625rem;
  left: 0.0625rem;
  transition: transform 0.2s;
}
:host([checked]) .knob {
  transform: translateX(calc(100% - var(--_form-toggle-input-knob-tie-width)));
}
.knob-tie {
  display: block;
  width: var(--_form-toggle-input-knob-tie-width);
  height: 100%;
  border-radius: 0.8125rem;
  background-color: var(--_form-toggle-input-knob-tie-color);
}
:host([checked]) .knob-tie {
  background-color: var(--_form-toggle-input-knob-tie-checked-color);
}

:host([active]),
:host(:hover) {
  background-color: var(--_form-toggle-input-container-pressed-color);
}

:host([with-icon]) .bg {
  width: 3.75rem;
  height: 2.5rem;
  border-radius: 1.25rem;
}
:host([with-icon]) .bg .knob-tie {
  display: flex;
  width: 2.25rem;
  height: 100%;
  align-items: center;
  justify-content: center;
  border-radius: 1.25rem;
}
:host([with-icon]) .bg .knob-tie [data-tag-name=bbva-type-icon] {
  fill: var(--_form-toggle-input-icon-knob-tie-color);
}

:host([with-icon][checked]) .bg .knob {
  transform: translateX(calc(100% - 36px));
}
:host([with-icon][checked]) .bg .knob-tie {
  background-color: var(--_form-toggle-input-knob-tie-checked-color);
}
:host([with-icon][checked]) .bg .knob-tie [data-tag-name=bbva-type-icon] {
  fill: var(--_form-toggle-input-control-checked-color);
}

:host([variant=card]) {
  display: inline-block;
  padding-bottom: 1rem;
  background-color: var(--_form-toggle-input-card-bg-color);
}
:host([variant=card]) .container {
  width: fit-content;
  margin-top: 1rem;
  margin-left: 1rem;
}
:host([variant=card]) .bg {
  margin: 0;
}
:host([variant=card]):host([focus-visible]) {
  outline: none;
}
:host([variant=card]):host([focus-visible]) .container {
  outline: 0.125rem solid var(--_form-toggle-input-focus-border-color);
  outline-offset: 0.25rem;
}
:host([variant=card]):host([focus-visible]):host([with-contrast][checked]) .container {
  outline-color: var(--_form-toggle-input-focus-border-contrast-color);
}

:host([variant=card][active]),
:host([variant=card]:hover) {
  background-color: var(--_form-toggle-input-card-pressed-bg-color);
}
:host([variant=card][active]) .container,
:host([variant=card]:hover) .container {
  background-color: var(--_form-toggle-input-card-pressed-bg-color);
}

:host([with-contrast][checked]) {
  background-color: var(--_form-toggle-input-contrast-bg-color);
}
:host([with-contrast][checked]) .bg {
  background-color: var(--_form-toggle-input-contrast-control-bg-color);
}
:host([with-contrast][checked]) .bg .knob-tie {
  background-color: var(--_form-toggle-input-contrast-knob-tie-checked-bg-color);
}

:host([with-contrast][checked][active]),
:host([with-contrast][checked]:hover) {
  background-color: var(--_form-toggle-input-contrast-pressed-bg-color);
}

:host([with-contrast][with-icon][checked]) .bg .knob-tie {
  background-color: var(--_form-toggle-input-contrast-icon-knob-tie-checked-bg-color);
}
:host([with-contrast][with-icon][checked]) .bg .knob-tie [data-tag-name=bbva-type-icon] {
  fill: var(--_form-toggle-input-contrast-icon-knob-tie-checked-color);
}

:host([variant=card][with-contrast][active]) .container,
:host([variant=card][with-contrast]:hover) .container {
  background-color: var(--_form-toggle-pressed-input-card-contrast-pressed-bg-color);
}

:host([variant=card][with-contrast][active][checked]),
:host([variant=card][with-contrast][checked]:hover) {
  background-color: var(--_form-toggle-input-card-contrast-pressed-checked-bg-color);
}

:host([divider-size=fit]) .divider-wrapper {
  padding: 0 1rem;
}

::slotted([slot=left]), ::slotted([slot=right]) {
  overflow: hidden;
  flex: 1;
}
`,q=o`
:host {
  --_form-toggle-input-control-color: var(--bbva-form-toggle-input--_ambient--control-color,
    var(--bbva-form-toggle-input--custom--primary-ambient--control-color,
      ${w("colorPrimaryFormSwitchBackgroundOff",F)}));
  --_form-toggle-input-control-checked-color: var(--bbva-form-toggle-input--_ambient--control-checked-color,
    var(--bbva-form-toggle-input--custom--primary-ambient--control-checked-color,
      ${w("colorPrimaryFormSwitchBackgroundOn",F)}));
  --_form-toggle-input-knob-tie-color: var(--bbva-form-toggle-input--_ambient--knob-tie-color,
    var(--bbva-form-toggle-input--custom--primary-ambient--knob-tie-color,
      ${w("colorPrimaryFormSwitchHandleOff",F)}));
  --_form-toggle-input-knob-tie-checked-color: var(--bbva-form-toggle-input--_ambient--knob-tie-checked-color,
    var(--bbva-form-toggle-input--custom--primary-ambient--knob-tie-checked-color,
      ${w("colorPrimaryFormSwitchHandleOn",F)}));
  --_form-toggle-input-container-pressed-color: var(--bbva-form-toggle-input--_ambient--container-pressed-color,
    var(--bbva-form-toggle-input--custom--primary-ambient--container-pressed-color,
      ${w("colorPrimarySurfaceAmbientPressed",F)}));
  --_form-toggle-input-icon-knob-tie-color: var(--bbva-form-toggle-input--_ambient--icon-knob-tie-color,
    var(--bbva-form-toggle-input--custom--primary-ambient--icon-knob-tie-color,
      ${w("colorPrimaryFormSwitchBackgroundOff",F)}));
  --_form-toggle-input-card-bg-color: var(--bbva-form-toggle-input--_ambient--card-bg-color,
    var(--bbva-form-toggle-input--custom--primary-ambient--card-bg-color,
      ${w("colorPrimarySurfaceAlternativeDefault",F)}));
  --_form-toggle-input-card-pressed-bg-color: var(--bbva-form-toggle-input--_ambient--card-pressed-bg-color,
    var(--bbva-form-toggle-input--custom--primary-ambient--card-pressed-bg-color,
      ${w("colorPrimarySurfaceAlternativePressed",F)}));
  --_form-toggle-input-card-contrast-pressed-checked-bg-color: var(--bbva-form-toggle-input--_ambient--card-contrast-pressed-checked-bg-color,
    var(--bbva-form-toggle-input--custom--primary-ambient--card-contrast-pressed-checked-bg-color,
      ${w("colorPrimarySurfaceContrastPressed",F)}));
  --_form-toggle-input-contrast-bg-color: var(--bbva-form-toggle-input--_ambient--contrast-bg-color,
    var(--bbva-form-toggle-input--custom--primary-ambient--contrast-bg-color,
      ${w("colorPrimarySurfaceContrastDefault",F)}));
  --_form-toggle-input-contrast-pressed-bg-color: var(--bbva-form-toggle-input--_ambient--contrast-pressed-bg-color,
    var(--bbva-form-toggle-input--custom--primary-ambient--contrast-pressed-bg-color,
      ${w("colorPrimarySurfaceContrastPressed",F)}));
  --_form-toggle-input-contrast-control-bg-color: var(--bbva-form-toggle-input--_ambient--contrast-control-bg-color,
    var(--bbva-form-toggle-input--custom--primary-ambient--contrast-control-bg-color,
      ${w("colorPrimaryFormSwitchBackgroundContrast",F)}));
  --_form-toggle-input-contrast-knob-tie-checked-bg-color: var(--bbva-form-toggle-input--_ambient--contrast-knob-tie-checked-bg-color,
    var(--bbva-form-toggle-input--custom--primary-ambient--contrast-knob-tie-checked-bg-color,
      ${w("colorPrimaryFormSwitchHandleContrast",F)}));
  --_form-toggle-input-contrast-icon-knob-tie-checked-bg-color: var(--bbva-form-toggle-input--_ambient--contrast-icon-knob-tie-checked-bg-color,
    var(--bbva-form-toggle-input--custom--primary-ambient--contrast-icon-knob-tie-checked-bg-color,
      ${w("colorPrimaryFormSwitchHandleContrast",F)}));
  --_form-toggle-input-contrast-icon-knob-tie-checked-color: var(--bbva-form-toggle-input--_ambient--contrast-icon-knob-tie-checked-color,
    var(--bbva-form-toggle-input--custom--primary-ambient--contrast-icon-knob-tie-checked-color,
      ${w("colorPrimaryFormSwitchBackgroundContrast",F)}));
  --_form-toggle-input-focus-border-color: var(--bbva-form-toggle-input--_ambient--focus-border-color,
    var(--bbva-form-toggle-input--custom--primary-ambient--focus-border-color,
      ${w("colorPrimarySurfaceAmbientFocus",F)}));
  --_form-toggle-input-focus-border-contrast-color: var(--bbva-form-toggle-input--_ambient--focus-border-contrast-color,
    var(--bbva-form-toggle-input--custom--primary-ambient--focus-border-contrast-color,
      ${w("colorPrimarySurfaceContrastFocus",F)}));
}
`;const G=o`
  :host([ambient='primary']),
  [ambient='primary'],
  [data-ambient='primary'] {
    --bbva-form-toggle-input-ambient-contrast: secondary-alt;
    --bbva-form-toggle-input-ambient-pressed-contrast: secondary;

    --bbva-form-toggle-input--_ambient--control-color: initial;
    --bbva-form-toggle-input--_ambient--control-checked-color: initial;
    --bbva-form-toggle-input--_ambient--knob-tie-color: initial;
    --bbva-form-toggle-input--_ambient--knob-tie-checked-color: initial;
    --bbva-form-toggle-input--_ambient--container-pressed-color: initial;

    --bbva-form-toggle-input--_ambient--icon-knob-tie-color: initial;

    --bbva-form-toggle-input--_ambient--card-bg-color: initial;
    --bbva-form-toggle-input--_ambient--card-pressed-bg-color: initial;

    --bbva-form-toggle-input--_ambient--card-contrast-pressed-checked-bg-color: initial;

    --bbva-form-toggle-input--_ambient--contrast-bg-color: initial;
    --bbva-form-toggle-input--_ambient--contrast-pressed-bg-color: initial;
    --bbva-form-toggle-input--_ambient--contrast-control-bg-color: initial;
    --bbva-form-toggle-input--_ambient--contrast-knob-tie-checked-bg-color: initial;
    --bbva-form-toggle-input--_ambient--contrast-icon-knob-tie-checked-bg-color: initial;
    --bbva-form-toggle-input--_ambient--contrast-icon-knob-tie-checked-color: initial;

    --bbva-form-toggle-input--_ambient--focus-border-color: initial;
    --bbva-form-toggle-input--_ambient--focus-border-contrast-color: initial;
  }
`,R=o`
  :host([ambient='primary-alt']),
  [ambient='primary-alt'],
  [data-ambient='primary-alt'] {
    --bbva-form-toggle-input-ambient-contrast: secondary-alt;
    --bbva-form-toggle-input-ambient-pressed-contrast: secondary;

    --bbva-form-toggle-input--_ambient--control-color: var(
      --bbva-form-toggle-input--custom--primary-alt-ambient--control-color,
      ${w("colorPrimaryAltFormSwitchBackgroundOff",F)}
    );
    --bbva-form-toggle-input--_ambient--control-checked-color: var(
      --bbva-form-toggle-input--custom--primary-alt-ambient--control-checked-color,
      ${w("colorPrimaryAltFormSwitchBackgroundOn",F)}
    );
    --bbva-form-toggle-input--_ambient--knob-tie-color: var(
      --bbva-form-toggle-input--custom--primary-alt-ambient--knob-tie-color,
      ${w("colorPrimaryAltFormSwitchHandleOff",F)}
    );
    --bbva-form-toggle-input--_ambient--knob-tie-checked-color: var(
      --bbva-form-toggle-input--custom--primary-alt-ambient--knob-tie-checked-color,
      ${w("colorPrimaryAltFormSwitchHandleOn",F)}
    );
    --bbva-form-toggle-input--_ambient--container-pressed-color: var(
      --bbva-form-toggle-input--custom--primary-alt-ambient--container-pressed-color,
      ${w("colorPrimaryAltSurfaceAmbientPressed",F)}
    );

    --bbva-form-toggle-input--_ambient--icon-knob-tie-color: var(
      --bbva-form-toggle-input--custom--primary-alt-ambient--icon-knob-tie-color,
      ${w("colorPrimaryAltFormSwitchBackgroundOff",F)}
    );

    --bbva-form-toggle-input--_ambient--card-bg-color: var(
      --bbva-form-toggle-input--custom--primary-alt-ambient--card-bg-color,
      ${w("colorPrimaryAltSurfaceAlternativeDefault",F)}
    );
    --bbva-form-toggle-input--_ambient--card-pressed-bg-color: var(
      --bbva-form-toggle-input--custom--primary-alt-ambient--card-pressed-bg-color,
      ${w("colorPrimaryAltSurfaceAlternativePressed",F)}
    );

    --bbva-form-toggle-input--_ambient--card-contrast-pressed-checked-bg-color: var(
      --bbva-form-toggle-input--custom--primary-alt-ambient--card-contrast-pressed-checked-bg-color,
      ${w("colorPrimaryAltSurfaceContrastPressed",F)}
    );

    --bbva-form-toggle-input--_ambient--contrast-bg-color: var(
      --bbva-form-toggle-input--custom--primary-alt-ambient--contrast-bg-color,
      ${w("colorPrimaryAltSurfaceContrastDefault",F)}
    );
    --bbva-form-toggle-input--_ambient--contrast-pressed-bg-color: var(
      --bbva-form-toggle-input--custom--primary-alt-ambient--contrast-pressed-bg-color,
      ${w("colorPrimaryAltSurfaceContrastPressed",F)}
    );
    --bbva-form-toggle-input--_ambient--contrast-control-bg-color: var(
      --bbva-form-toggle-input--custom--primary-alt-ambient--contrast-control-bg-color,
      ${w("colorPrimaryAltFormSwitchBackgroundContrast",F)}
    );
    --bbva-form-toggle-input--_ambient--contrast-knob-tie-checked-bg-color: var(
      --bbva-form-toggle-input--custom--primary-alt-ambient--contrast-knob-tie-checked-bg-color,
      ${w("colorPrimaryAltFormSwitchHandleContrast",F)}
    );
    --bbva-form-toggle-input--_ambient--contrast-icon-knob-tie-checked-bg-color: var(
      --bbva-form-toggle-input--custom--primary-alt-ambient--contrast-icon-knob-tie-checked-bg-color,
      ${w("colorPrimaryAltFormSwitchHandleContrast",F)}
    );
    --bbva-form-toggle-input--_ambient--contrast-icon-knob-tie-checked-color: var(
      --bbva-form-toggle-input--custom--primary-alt-ambient--contrast-icon-knob-tie-checked-color,
      ${w("colorPrimaryAltFormSwitchBackgroundContrast",F)}
    );
    --bbva-form-toggle-input--_ambient--focus-border-color: var(
      --bbva-form-toggle-input--custom--primary-alt-ambient--focus-border-color,
      ${w("colorPrimaryAltSurfaceAmbientFocus",F)}
    );
    --bbva-form-toggle-input--_ambient--focus-border-contrast-color: var(
      --bbva-form-toggle-input--custom--primary-alt-ambient--focus-border-contrast-color,
      ${w("colorPrimaryAltSurfaceContrastFocus",F)});
  }
`,J=o`
  :host([ambient='secondary']),
  [ambient='secondary'],
  [data-ambient='secondary'] {
    --bbva-form-toggle-input-ambient-contrast: primary-alt;
    --bbva-form-toggle-input-ambient-pressed-contrast: primary;

    --bbva-form-toggle-input--_ambient--control-color: var(
      --bbva-form-toggle-input--custom--secondary-ambient--control-color,
      ${w("colorSecondaryFormSwitchBackgroundOff",F)}
    );
    --bbva-form-toggle-input--_ambient--control-checked-color: var(
      --bbva-form-toggle-input--custom--secondary-ambient--control-checked-color,
      ${w("colorSecondaryFormSwitchBackgroundOn",F)}
    );
    --bbva-form-toggle-input--_ambient--knob-tie-color: var(
      --bbva-form-toggle-input--custom--secondary-ambient--knob-tie-color,
      ${w("colorSecondaryFormSwitchHandleOff",F)}
    );
    --bbva-form-toggle-input--_ambient--knob-tie-checked-color: var(
      --bbva-form-toggle-input--custom--secondary-ambient--knob-tie-checked-color,
      ${w("colorSecondaryFormSwitchHandleOn",F)}
    );
    --bbva-form-toggle-input--_ambient--container-pressed-color: var(
      --bbva-form-toggle-input--custom--secondary-ambient--container-pressed-color,
      ${w("colorSecondarySurfaceAmbientPressed",F)}
    );

    --bbva-form-toggle-input--_ambient--icon-knob-tie-color: var(
      --bbva-form-toggle-input--custom--secondary-ambient--icon-knob-tie-color,
      ${w("colorSecondaryFormSwitchBackgroundOff",F)}
    );

    --bbva-form-toggle-input--_ambient--card-bg-color: var(
      --bbva-form-toggle-input--custom--secondary-ambient--card-bg-color,
      ${w("colorSecondarySurfaceAlternativeDefault",F)}
    );
    --bbva-form-toggle-input--_ambient--card-pressed-bg-color: var(
      --bbva-form-toggle-input--custom--secondary-ambient--card-pressed-bg-color,
      ${w("colorSecondarySurfaceAlternativePressed",F)}
    );

    --bbva-form-toggle-input--_ambient--card-contrast-pressed-checked-bg-color: var(
      --bbva-form-toggle-input--custom--secondary-ambient--card-contrast-pressed-checked-bg-color,
      ${w("colorSecondarySurfaceContrastPressed",F)}
    );

    --bbva-form-toggle-input--_ambient--contrast-bg-color: var(
      --bbva-form-toggle-input--custom--secondary-ambient--contrast-bg-color,
      ${w("colorSecondarySurfaceContrastDefault",F)}
    );
    --bbva-form-toggle-input--_ambient--contrast-pressed-bg-color: var(
      --bbva-form-toggle-input--custom--secondary-ambient--contrast-pressed-bg-color,
      ${w("colorSecondarySurfaceContrastPressed",F)}
    );
    --bbva-form-toggle-input--_ambient--contrast-control-bg-color: var(
      --bbva-form-toggle-input--custom--secondary-ambient--contrast-control-bg-color,
      ${w("colorSecondaryFormSwitchBackgroundContrast",F)}
    );
    --bbva-form-toggle-input--_ambient--contrast-knob-tie-checked-bg-color: var(
      --bbva-form-toggle-input--custom--secondary-ambient--contrast-knob-tie-checked-bg-color,
      ${w("colorSecondaryFormSwitchHandleContrast",F)}
    );
    --bbva-form-toggle-input--_ambient--contrast-icon-knob-tie-checked-bg-color: var(
      --bbva-form-toggle-input--custom--secondary-ambient--contrast-icon-knob-tie-checked-bg-color,
      ${w("colorSecondaryFormSwitchHandleContrast",F)}
    );
    --bbva-form-toggle-input--_ambient--contrast-icon-knob-tie-checked-color: var(
      --bbva-form-toggle-input--custom--secondary-ambient--contrast-icon-knob-tie-checked-color,
      ${w("colorSecondaryFormSwitchBackgroundContrast",F)}
    );
    --bbva-form-toggle-input--_ambient--focus-border-color: var(
      --bbva-form-toggle-input--custom--secondary-ambient--focus-border-color,
      ${w("colorSecondarySurfaceAmbientFocus",F)}
    );
    --bbva-form-toggle-input--_ambient--focus-border-contrast-color: var(
      --bbva-form-toggle-input--custom--secondary-ambient--focus-border-contrast-color,
      ${w("colorSecondarySurfaceContrastFocus",F)});
  }
`,K=o`
  :host([ambient='secondary-alt']),
  [ambient='secondary-alt'],
  [data-ambient='secondary-alt'] {
    --bbva-form-toggle-input-ambient-contrast: primary-alt;
    --bbva-form-toggle-input-ambient-pressed-contrast: primary;

    --bbva-form-toggle-input--_ambient--control-color: var(
      --bbva-form-toggle-input--custom--secondary-alt-ambient--control-color,
      ${w("colorSecondaryAltFormSwitchBackgroundOff",F)}
    );
    --bbva-form-toggle-input--_ambient--control-checked-color: var(
      --bbva-form-toggle-input--custom--secondary-alt-ambient--control-checked-color,
      ${w("colorSecondaryAltFormSwitchBackgroundOn",F)}
    );
    --bbva-form-toggle-input--_ambient--knob-tie-color: var(
      --bbva-form-toggle-input--custom--secondary-alt-ambient--knob-tie-color,
      ${w("colorSecondaryAltFormSwitchHandleOff",F)}
    );
    --bbva-form-toggle-input--_ambient--knob-tie-checked-color: var(
      --bbva-form-toggle-input--custom--secondary-alt-ambient--knob-tie-checked-color,
      ${w("colorSecondaryAltFormSwitchHandleOn",F)}
    );
    --bbva-form-toggle-input--_ambient--container-pressed-color: var(
      --bbva-form-toggle-input--custom--secondary-alt-ambient--container-pressed-color,
      ${w("colorSecondaryAltSurfaceAmbientPressed",F)}
    );

    --bbva-form-toggle-input--_ambient--icon-knob-tie-color: var(
      --bbva-form-toggle-input--custom--secondary-alt-ambient--icon-knob-tie-color,
      ${w("colorSecondaryAltFormSwitchBackgroundOff",F)}
    );

    --bbva-form-toggle-input--_ambient--card-bg-color: var(
      --bbva-form-toggle-input--custom--secondary-alt-ambient--card-bg-color,
      ${w("colorSecondaryAltSurfaceAlternativeDefault",F)}
    );
    --bbva-form-toggle-input--_ambient--card-pressed-bg-color: var(
      --bbva-form-toggle-input--custom--secondary-alt-ambient--card-pressed-bg-color,
      ${w("colorSecondaryAltSurfaceAlternativePressed",F)}
    );

    --bbva-form-toggle-input--_ambient--card-contrast-pressed-checked-bg-color: var(
      --bbva-form-toggle-input--custom--secondary-alt-ambient--card-contrast-pressed-checked-bg-color,
      ${w("colorSecondaryAltSurfaceContrastPressed",F)}
    );

    --bbva-form-toggle-input--_ambient--contrast-bg-color: var(
      --bbva-form-toggle-input--custom--secondary-alt-ambient--contrast-bg-color,
      ${w("colorSecondaryAltSurfaceContrastDefault",F)}
    );
    --bbva-form-toggle-input--_ambient--contrast-pressed-bg-color: var(
      --bbva-form-toggle-input--custom--secondary-alt-ambient--contrast-pressed-bg-color,
      ${w("colorSecondaryAltSurfaceContrastPressed",F)}
    );
    --bbva-form-toggle-input--_ambient--contrast-control-bg-color: var(
      --bbva-form-toggle-input--custom--secondary-alt-ambient--contrast-control-bg-color,
      ${w("colorSecondaryAltFormSwitchBackgroundContrast",F)}
    );
    --bbva-form-toggle-input--_ambient--contrast-knob-tie-checked-bg-color: var(
      --bbva-form-toggle-input--custom--secondary-alt-ambient--contrast-knob-tie-checked-bg-color,
      ${w("colorSecondaryAltFormSwitchHandleContrast",F)}
    );
    --bbva-form-toggle-input--_ambient--contrast-icon-knob-tie-checked-bg-color: var(
      --bbva-form-toggle-input--custom--secondary-alt-ambient--contrast-icon-knob-tie-checked-bg-color,
      ${w("colorSecondaryAltFormSwitchHandleContrast",F)}
    );
    --bbva-form-toggle-input--_ambient--contrast-icon-knob-tie-checked-color: var(
      --bbva-form-toggle-input--custom--secondary-alt-ambient--contrast-icon-knob-tie-checked-color,
      ${w("colorSecondaryAltFormSwitchBackgroundContrast",F)}
    );
    --bbva-form-toggle-input--_ambient--focus-border-color: var(
      --bbva-form-toggle-input--custom--secondary-alt-ambient--focus-border-color,
      ${w("colorSecondaryAltSurfaceAmbientFocus",F)}
    );
    --bbva-form-toggle-input--_ambient--focus-border-contrast-color: var(
      --bbva-form-toggle-input--custom--secondary-alt-ambient--focus-border-contrast-color,
      ${w("colorSecondaryAltSurfaceContrastFocus",F)});
  }
`;const Y=h([Object.freeze({__proto__:null,primary:G,primaryAlt:R,secondary:J,secondaryAlt:K}),P,B]),Z=Object.values(Y);class oo extends(S(e(v))){static get is(){return"bbva-form-toggle-input"}static get scopedElements(){const o=[D,E];return oo.scopedElementsFromClasses(o)}static get properties(){return{variant:{type:String},alignment:{type:String,reflect:!0},withIcon:{type:Boolean,attribute:"with-icon"},withContrast:{type:Boolean,attribute:"with-contrast"},noChangeState:{type:Boolean,attribute:"no-change-state"},dividerSize:{type:String,attribute:"divider-size"},_slotContent:{type:Array},verticalAlignTop:{type:Boolean,attribute:"vertical-align-top"}}}constructor(){super(),this.variant="",this.alignment="left",this.withContrast=!1,this.noChangeState=!1,this.dividerSize="",this._slotContent=[],this.addEventListener("slotschanges",this._slotChanges),this.addEventListener("mousedown",this._updateColors),this.addEventListener("touchstart",this._updateColors),this.verticalAlignTop=!1}_slotChanges(o){const{slotName:r,contentSlots:t}=o.detail;["right","left","bottom"].includes(r)&&t.length&&(this._slotContent=Array.from(t))}_updateColors(){this.active&&this._changeAmbient("--bbva-form-toggle-input-ambient-pressed-contrast","secondary")}static get styles(){return[super.styles,X,q,Z,c("bbva-form-toggle-option-shared-styles")]}updated(o){super.updated&&super.updated(o),this._slotContent.length&&this._changeAmbient("--bbva-form-toggle-input-ambient-contrast","secondary-alt"),1!==this._countChildren()||this.verticalAlignTop||this.style.setProperty("--bbva-form-control-input-container-align","center")}_changeAmbient(o,r){this._slotContent.forEach((t=>{const a=t.assignedNodes;let e="";if(this.checked&&this.withContrast){e=window.getComputedStyle(document.body).getPropertyValue(o).trim()||r}a.setAttribute("ambient",e)}))}_countChildren(){var o;return null===(o=this._slotContent[0])||void 0===o?void 0:o.assignedNodes.children.length}get _labelledInput(){return i`
      <div class="container">
        <slot name="left"></slot>
        ${this._inputTemplate} ${this._labelTemplate}
        <slot name="right"></slot>
      </div>
      <slot name="bottom"></slot>
    `}get _inputTemplate(){return i`
      ${this.withIcon?i` <span class="bg" aria-label="switch" aria-hidden="true">
            <span class="knob">
              <span class="knob-tie">
                <bbva-type-icon .icon="${f()}" size="24"></bbva-type-icon>
              </span>
            </span>
          </span>`:super._inputTemplate}
    `}_toggle(){this.noChangeState?(this._dispatchEvent("change"),this._dispatchEvent("input")):super._toggle()}render(){return i`
      ${super.render()}
      ${this.dividerSize?i`<div class="divider-wrapper">
            <bbva-divider-default size="full"></bbva-divider-default>
          </div>`:i``}
    `}}export{H as B,V as a,oo as b,Q as c,z as d,Y as e};
