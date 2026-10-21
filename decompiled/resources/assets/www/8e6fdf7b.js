import{z as o,a8 as r,a9 as t,aa as e,bf as a,b0 as c,a as n,an as i,aM as l,L as b,ak as s,h as d,i as g,aD as m,ag as p,b6 as v,ac as h,ad as u,ab as f,by as k,bS as y,bE as C,F as $,b4 as x,cr as _,bp as L,g as S}from"./952f98a9.js";var P=o`:host {
  display: block;
  box-sizing: border-box;
  --_form-container-help-icon-color: var(--bbva-form-container-dark-mode-help-icon-color, var(--bbva-form-container-help-icon-color, var(--colorsPrimaryMedium, ${r(t.primaryMedium)})));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.label-out {
  display: flex;
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 16) * 1em);
}
.label-out [data-tag-name=bbva-link] {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 16) * 1rem);
  --bbva-link-with-icon-icon-color: var(--_form-container-help-icon-color);
}

:host([variant=card]) {
  width: 18rem;
}
:host([variant=card]) .form-container {
  box-shadow: var(--boxShadowType1, ${r(a.type1)});
}
:host([variant=card]) .label-out {
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 16) * 1rem);
}
`,w=o`[ambient^=light] {
  --bbva-form-container-help-icon-color: initial;
}
`,D=o`[ambient=dark100] {
  --bbva-form-container-help-icon-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
}

[ambient=dark400] {
  --bbva-form-container-help-icon-color: var(--colorsPrimarySubdued, ${r(t.primarySubdued)});
}
`;const M={dark:o`
    ${c.dark}
    ${D}
  `,light:o`
    ${c.light}
    ${w}
  `};class z extends(n(i(l(b)))){static get is(){return"bbva-form-container"}static get scopedElements(){const o=[p,v];return z.scopedElementsFromClasses(o)}static get properties(){return{labelOut:{type:String,attribute:"label-out"},showHelpIcon:{type:Boolean,attribute:"show-help-icon"},linkHref:{type:String,attribute:"link-href"},linkAccessibilityText:{type:String,attribute:"link-accessibility-text"},dividerSize:{type:String,attribute:"divider-size"},slotContent:{type:Array}}}constructor(){super(),this.showHelpIcon=!1,this.slotContent=[],this.labelOut="",this.dividerSize="",this.linkAccessibilityText="bbva-form-container-link-accessibility-text"}firstUpdated(){super.firstUpdated(),this.addEventListener("slotschanges",this._slotChanges),this.addEventListener("change",(o=>this._itemChange(o))),this.addEventListener("input",(o=>this._dispatchInput(o)))}static get styles(){return[P,M.light,M.dark,s("bbva-form-container-shared-styles")]}_slotChanges(o){const{slotName:r,contentSlots:t}=o.detail;if("_option"===r){this.slotContent=t,this._includeDivider();this.slotContent.every((o=>{var r;return"radio"===(null===(r=o.assignedNodes)||void 0===r?void 0:r.type)}))&&(this.setAttribute("role","radiogroup"),this.labelOut&&this.setAttribute("aria-labelledby","label-out"))}}_includeDivider(){this.slotContent.forEach(((o,r)=>{const t=o.assignedNodes;t.hasAttribute("divider-size")||r===this.slotContent.length-1||t.setAttribute("divider-size",this.dividerSize)}))}_helpClicked(o){o.stopPropagation(),this.dispatchEvent(new CustomEvent("form-container-help-click",{bubbles:!0,composed:!0}))}get _labelOut(){return d`
      <div class="label-out">
        <bbva-text id="label-out" unset text="${this.labelOut}" size="S"></bbva-text>

        ${this.showHelpIcon?d`
              <bbva-link
                aria-label="${this.t(this.linkAccessibilityText)}"
                icon-size="24"
                @click="${this._helpClicked}"
                href="${g(this.linkHref)}"
                icon="${m()}"
              >
              </bbva-link>
            `:""}
      </div>
    `}_itemChange(o){const{value:r,checked:t,type:e}=null==o?void 0:o.target,a="radio"===e?this.formItems.indexOf(null==o?void 0:o.target):"";this.dispatchEvent(new CustomEvent(`form-container-${this._setAvailableTypes(e)}-change`,{bubbles:!0,composed:!0,detail:{value:r,checked:t,..."radio"===e&&{selected:a}}}))}_setAvailableTypes(o){return this.types={checkbox:"checkbox",radio:"radio"},this.types[o]||"toggle"}_dispatchInput(o){const{type:r}=null==o?void 0:o.target;this.dispatchEvent(new CustomEvent(`form-container-${r}-input`,{bubbles:!0,composed:!0}))}get formItems(){var o,r,t;const e=null===(o=(this.slotContent||[])[0])||void 0===o||null===(r=o.assignedNodes)||void 0===r||null===(t=r.constructor)||void 0===t?void 0:t.is;return Array.from(this.querySelectorAll(`[data-tag-name="${e}"]`))}static get _formList(){return d`
      <div class="form-container">
        <slot name="_option"></slot>
      </div>
    `}render(){return d`
      ${this.labelOut?this._labelOut:""} ${z._formList}
      <slot></slot>
    `}}var E=o`:host {
  display: inline-block;
  position: relative;
  font: inherit;
  box-sizing: border-box;
  width: 100%;
  cursor: pointer;
  font-size: var(--typographyTypeSmall, ${r(h.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${r(u.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${r(f.book.fontWeight)});
  --_form-control-input-border-color: var(--bbva-form-control-input-dark-mode-border-color, var(--bbva-form-control-input-border-color, var(--colorsSecondary500, ${r(t.secondary500)})));
  --_form-control-input-box-bg-color: var(--bbva-form-control-input-dark-mode-box-bg-color, var(--bbva-form-control-input-box-bg-color, var(--colorsSecondary100, ${r(t.secondary100)})));
  --_form-control-input-check-color: var(--bbva-form-control-input-dark-mode-check-color, var(--bbva-form-control-input-check-color, var(--colorsPrimaryCore, ${r(t.primaryCore)})));
  --_form-control-input-container-pressed-bg-color: var(--bbva-form-control-input-dark-mode-container-pressed-bg-color, var(--bbva-form-control-input-container-pressed-bg-color,var(--colorsSecondary100, ${r(t.secondary100)})));
  --_form-control-input-pressed-box-bg-color: var(--bbva-form-control-input-dark-mode-pressed-box-bg-color, var(--bbva-form-control-input-pressed-box-bg-color,var(--colorsSecondary100, ${r(t.secondary100)})));
  --_form-control-input-card-bg-color: var(--bbva-form-control-input-dark-mode-card-bg-color, var(--bbva-form-control-input-card-bg-color,var(--colorsSecondary100, ${r(t.secondary100)})));
  --_form-control-input-card-pressed-bg-color: var(--bbva-form-control-input-dark-mode-card-pressed-bg-color, var(--bbva-form-control-input-card-pressed-bg-color,var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)})));
  --_form-control-input-card-box-bg-color: var(--bbva-form-control-input-dark-mode-card-box-bg-color, var(--bbva-form-control-input-card-box-bg-color,var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)})));
  --_form-control-input-card-box-pressed-bg-color: var(--bbva-form-control-input-dark-mode-card-box-pressed-bg-color, var(--bbva-form-control-input-card-box-pressed-bg-color,var(--colorsSecondary100, ${r(t.secondary100)})));
  --_form-control-input-card-contrast-bg-color: var(--bbva-form-control-input-dark-mode-card-contrast-bg-color, var(--bbva-form-control-input-card-contrast-bg-color,var(--colorsPrimaryCoreDark, ${r(t.primaryCoreDark)})));
  --_form-control-input-card-contrast-box-bg-color: var(--bbva-form-control-input-dark-mode-card-contrast-box-bg-color, var(--bbva-form-control-input-card-contrast-box-bg-color,var(--colorsPrimaryCore, ${r(t.primaryCore)})));
  --_form-control-input-contrast-bg-color: var(--bbva-form-control-input-dark-mode-contrast-bg-color, var(--bbva-form-control-input-contrast-bg-color,var(--colorsPrimaryCoreDark, ${r(t.primaryCoreDark)})));
  --_form-control-input-contrast-pressed-bg-color: var(--bbva-form-control-input-dark-mode-contrast-pressed-bg-color, var(--bbva-form-control-input-contrast-pressed-bg-color,var(--colorsPrimaryCoreDarkened, ${r(t.primaryCoreDarkened)})));
  --_form-control-input-contrast-box-bg-color: var(--bbva-form-control-input-dark-mode-contrast-box-bg-color, var(--bbva-form-control-input-contrast-box-bg-color,var(--colorsPrimaryCore, ${r(t.primaryCore)})));
  --_form-control-input-contrast-border-color: var(--bbva-form-control-input-dark-mode-contrast-border-color, var(--bbva-form-control-input-contrast-border-color,var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)})));
  --_form-control-input-contrast-check-color: var(--bbva-form-control-input-dark-mode-contrast-check-color, var(--bbva-form-control-input-contrast-check-color,var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)})));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.container {
  display: flex;
  align-items: var(--bbva-form-control-input-container-align, flex-start);
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 15) * 1em);
}

.box {
  flex: none;
  display: flex;
  justify-content: center;
  align-items: center;
  width: 2rem;
  height: 2rem;
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 16) * 1rem);
  border: 1px solid var(--_form-control-input-border-color);
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
  fill: var(--_form-control-input-check-color);
  background-color: transparent;
}
:host([aria-checked=true]) :host([type=checkbox]) .box .check, :host([aria-checked=mixed]) :host([type=checkbox]) .box .check {
  opacity: 1;
}

:host([active]) {
  background-color: var(--_form-control-input-container-pressed-bg-color);
}
:host([active]) .box {
  background-color: var(--_form-control-input-pressed-box-bg-color);
}

:host([variant=card]) {
  background-color: var(--_form-control-input-card-bg-color);
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 16) * 1rem);
  box-shadow: var(--boxShadowType1, ${r(a.type1)});
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 16) * 1rem);
}
:host([variant=card]) .box {
  background-color: var(--_form-control-input-card-box-bg-color);
}
:host([variant=card]) .container {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 16) * 1rem) 0;
}

:host([with-contrast][aria-checked=true]) {
  background-color: var(--_form-control-input-contrast-bg-color);
}
:host([with-contrast][aria-checked=true]) .box {
  background-color: var(--_form-control-input-contrast-box-bg-color);
  border: 1px solid var(--_form-control-input-contrast-border-color);
}
:host([with-contrast][aria-checked=true]) .box .check {
  background-color: var(--_form-control-input-contrast-check-color);
}

:host([variant=card][active]) {
  background-color: var(--_form-control-input-card-pressed-bg-color);
}
:host([variant=card][active]) .box {
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

:host([with-contrast][type=checkbox][aria-checked=true][active]) {
  background-color: var(--_form-control-input-contrast-pressed-bg-color);
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

::slotted([slot=left]) {
  flex: 1;
  overflow: hidden;
}
`,A=o`[ambient^=light] {
  --bbva-form-control-input-ambient-contrast: dark300;
  --bbva-form-control-input-ambient-pressed-contrast: dark400;
  --bbva-form-control-input-card-bg-color: initial;
  --bbva-form-control-input-border-color: initial;
  --bbva-form-control-input-check-color: initial;
  --bbva-form-control-input-box-bg-color: initial;
  --bbva-form-control-input-card-box-bg-color: initial;
  --bbva-form-control-input-card-pressed-bg-color: initial;
  --bbva-form-control-input-card-box-pressed-bg-color: initial;
  --bbva-form-control-input-card-contrast-bg-color: initial;
  --bbva-form-control-input-card-contrast-box-bg-color: initial;
  --bbva-form-control-input-container-pressed-bg-color: initial;
  --bbva-form-control-input-pressed-box-bg-color: initial;
  --bbva-form-control-input-contrast-bg-color: initial;
  --bbva-form-control-input-contrast-pressed-bg-color: initial;
  --bbva-form-control-input-contrast-box-bg-color: initial;
  --bbva-form-control-input-contrast-border-color: initial;
  --bbva-form-control-input-contrast-check-color: initial;
}

[ambient=light100] {
  --bbva-form-control-input-ambient-contrast: dark300;
  --bbva-form-control-input-ambient-pressed-contrast: dark400;
  --bbva-form-control-input-box-bg-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-form-control-input-card-bg-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-form-control-input-card-pressed-bg-color: var(--colorsSecondary100, ${r(t.secondary100)});
  --bbva-form-control-input-container-pressed-bg-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-form-control-input-pressed-box-bg-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-form-control-input-card-box-bg-color: var(--colorsSecondary100, ${r(t.secondary100)});
}
`;const I={dark:o`
    ${o`[ambient=dark100] {
  --bbva-form-control-input-ambient-contrast: light;
  --bbva-form-control-input-ambient-pressed-contrast: light100;
  --bbva-form-control-input-card-bg-color: var(--colorsPrimaryCore, ${r(t.primaryCore)});
  --bbva-form-control-input-border-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-form-control-input-check-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-form-control-input-box-bg-color: var(--colorsPrimaryCoreLight, ${r(t.primaryCoreLight)});
  --bbva-form-control-input-card-box-bg-color: var(--colorsPrimaryCoreLight, ${r(t.primaryCoreLight)});
  --bbva-form-control-input-card-pressed-bg-color: var(--colorsPrimaryCoreDark, ${r(t.primaryCoreDark)});
  --bbva-form-control-input-card-box-pressed-bg-color: var(--colorsPrimaryCoreLight, ${r(t.primaryCoreLight)});
  --bbva-form-control-input-card-contrast-bg-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-form-control-input-card-contrast-box-bg-color: var(--colorsSecondary100, ${r(t.secondary100)});
  --bbva-form-control-input-container-pressed-bg-color: var(--colorsPrimaryCoreDark, ${r(t.primaryCoreDark)});
  --bbva-form-control-input-pressed-box-bg-color: var(--colorsPrimaryCoreLight, ${r(t.primaryCoreLight)});
  --bbva-form-control-input-contrast-bg-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-form-control-input-contrast-pressed-bg-color: var(--colorsSecondary100, ${r(t.secondary100)});
  --bbva-form-control-input-contrast-box-bg-color: var(--colorsSecondary100, ${r(t.secondary100)});
  --bbva-form-control-input-contrast-border-color: var(--colorsSecondary500, ${r(t.secondary500)});
  --bbva-form-control-input-contrast-check-color: var(--colorsPrimaryCore, ${r(t.primaryCore)});
}

[ambient=dark400] {
  --bbva-form-control-input-ambient-contrast: light;
  --bbva-form-control-input-ambient-pressed-contrast: light100;
  --bbva-form-control-input-border-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-form-control-input-check-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-form-control-input-box-bg-color: var(--colorsPrimaryCoreDark, ${r(t.primaryCoreDark)});
  --bbva-form-control-input-card-bg-color: var(--colorsPrimaryCoreDark, ${r(t.primaryCoreDark)});
  --bbva-form-control-input-card-box-bg-color: var(--colorsPrimaryCoreDark, ${r(t.primaryCoreDark)});
  --bbva-form-control-input-card-pressed-bg-color: var(--colorsPrimaryCoreDarkened, ${r(t.primaryCoreDarkened)});
  --bbva-form-control-input-card-box-pressed-bg-color: var(--colorsPrimaryCore, ${r(t.primaryCore)});
  --bbva-form-control-input-card-contrast-bg-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-form-control-input-card-contrast-box-bg-color: var(--colorsSecondary100, ${r(t.secondary100)});
  --bbva-form-control-input-container-pressed-bg-color: var(--colorsPrimaryCoreDark, ${r(t.primaryCoreDark)});
  --bbva-form-control-input-pressed-box-bg-color: var(--colorsPrimaryCoreDark, ${r(t.primaryCoreDark)});
  --bbva-form-control-input-contrast-bg-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-form-control-input-contrast-pressed-bg-color: var(--colorsSecondary100, ${r(t.secondary100)});
  --bbva-form-control-input-contrast-box-bg-color: var(--colorsSecondary100, ${r(t.secondary100)});
  --bbva-form-control-input-contrast-border-color: var(--colorsSecondary500, ${r(t.secondary500)});
  --bbva-form-control-input-contrast-check-color: var(--colorsPrimaryCore, ${r(t.primaryCore)});
}
`}
  `,light:o`
    ${A}
  `};class T extends(n(l(k))){static get is(){return"bbva-form-control-input"}static get scopedElements(){const o=[$,x];return T.scopedElementsFromClasses(o)}static get properties(){return{variant:{type:String},alignment:{type:String,reflect:!0},checkIcon:{type:String,attribute:"check-icon"},indeterminateIcon:{type:String,attribute:"indeterminate-icon"},withContrast:{type:Boolean,attribute:"with-contrast"},dividerSize:{type:String,attribute:"divider-size"},_slotContent:{type:Array}}}constructor(){super(),this.variant="",this.alignment="left",this.checkIcon=y(),this.indeterminateIcon=C(),this.withContrast=!1,this.dividerSize="",this._slotContent=[],this.addEventListener("slotschanges",this._slotChanges),this.addEventListener("mousedown",this._updateColors),this.addEventListener("touchstart",this._updateColors)}_slotChanges(o){const{slotName:r,contentSlots:t}=o.detail;["right","left","bottom"].includes(r)&&t.length&&(this._slotContent=Array.from(t))}_updateColors(){this.active&&"checkbox"===this.type&&this._changeAmbient("--bbva-form-control-input-ambient-pressed-contrast","dark400")}static get styles(){return[super.styles,E,I.dark,I.light,s("bbva-form-toggle-option-shared-styles")]}updated(o){super.updated&&super.updated(o),this._slotContent.length&&this._changeAmbient("--bbva-form-control-input-ambient-contrast","dark300")}_changeAmbient(o,r){this._slotContent.forEach((t=>{const e=t.assignedNodes;let a="";if(this.checked&&this.withContrast){a=window.getComputedStyle(document.body).getPropertyValue(o).trim()||r}e.setAttribute("ambient",a)}))}get _checkIcon(){return this.indeterminate?this.indeterminateIcon:this.checkIcon}get _inputTemplate(){return"checkbox"===this.type?d`
          <slot name="input-template">
            <span class="box">
              <bbva-icon class="check" .icon="${this._checkIcon}" size="24"></bbva-icon>
            </span>
          </slot>
        `:super._inputTemplate}get _labelledInput(){return d`
      <div class="container">
        <slot name="left"></slot>
        ${this._inputTemplate} ${this._labelTemplate}
        <slot name="right"></slot>
      </div>
      <slot name="bottom"></slot>
    `}render(){return d`
      ${this._labelledInput} ${this._control}
      ${this.dividerSize?d`<bbva-divider size="${this.dividerSize}"></bbva-divider>`:d``}
    `}}var V=o`[ambient^=light] {
  --bbva-form-toggle-input-ambient-contrast: dark300;
  --bbva-form-toggle-input-ambient-pressed-contrast: dark400;
  --bbva-form-toggle-input-card-container-bg-color: initial;
  --bbva-form-toggle-input-color: initial;
  --bbva-form-toggle-input-knob-tie-color: initial;
  --bbva-form-toggle-input-checked-color: initial;
  --bbva-form-toggle-input-knob-tie-checked-color: initial;
  --bbva-form-toggle-input-card-container-pressed-bg-color: initial;
  --bbva-form-toggle-input-container-pressed-color: initial;
  --bbva-form-toggle-input-contrast-bg-color: initial;
  --bbva-form-toggle-input-contrast-pressed-bg-color: initial;
  --bbva-form-toggle-input-contrast-control-bg-color: initial;
  --bbva-form-toggle-input-contrast-knob-tie-checked-color: initial;
  --bbva-form-toggle-input-contrast-icon-knob-tie-checked-bg-color: initial;
  --bbva-form-toggle-input-contrast-icon-knob-tie-checked-color: initial;
  --bbva-form-toggle-input-card-bg-color: initial;
  --bbva-form-toggle-input-card-pressed-bg-color: initial;
  --bbva-form-toggle-input-card-contrast-pressed-checked-bg-color: initial;
}

[ambient=light100] {
  --bbva-form-toggle-input-ambient-contrast: dark300;
  --bbva-form-toggle-input-ambient-pressed-contrast: dark400;
  --bbva-form-toggle-input-container-pressed-color: var(--colorsSecondary100, ${r(t.secondary100)});
  --bbva-form-toggle-input-card-bg-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-form-toggle-input-card-pressed-bg-color: var(--colorsSecondary100, ${r(t.secondary100)});
}
`;o`
    ${o`[ambient=dark100] {
  --bbva-form-toggle-input-ambient-contrast: light;
  --bbva-form-toggle-input-ambient-pressed-contrast: light100;
  --bbva-form-toggle-input-card-container-bg-color: var(--colorsPrimaryCore, ${r(t.primaryCore)});
  --bbva-form-toggle-input-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-form-toggle-input-knob-tie-color: var(--colorsSecondary500, ${r(t.secondary500)});
  --bbva-form-toggle-input-checked-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-form-toggle-input-knob-tie-checked-color: var(--colorsPrimaryMedium, ${r(t.primaryMedium)});
  --bbva-form-toggle-input-card-container-pressed-bg-color: var(--colorsPrimaryCoreDark, ${r(t.primaryCoreDark)});
  --bbva-form-toggle-input-container-pressed-color: var(--colorsPrimaryCore, ${r(t.primaryCore)});
  --bbva-form-toggle-input-contrast-bg-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-form-toggle-input-contrast-pressed-bg-color: var(--colorsSecondary100, ${r(t.secondary100)});
  --bbva-form-toggle-input-contrast-control-bg-color: var(--colorsPrimaryMedium, ${r(t.primaryMedium)});
  --bbva-form-toggle-input-contrast-knob-tie-checked-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-form-toggle-input-contrast-icon-knob-tie-checked-bg-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-form-toggle-input-contrast-icon-knob-tie-checked-color: var(--colorsPrimaryMedium, ${r(t.primaryMedium)});
  --bbva-form-toggle-input-card-bg-color: var(--colorsPrimaryCore, ${r(t.primaryCore)});
  --bbva-form-toggle-input-card-pressed-bg-color: var(--colorsPrimaryCoreDark, ${r(t.primaryCoreDark)});
  --bbva-form-toggle-input-card-contrast-pressed-checked-bg-color: var(--colorsSecondary100, ${r(t.secondary100)});
}

[ambient=dark400] {
  --bbva-form-toggle-input-ambient-contrast: light;
  --bbva-form-toggle-input-ambient-pressed-contrast: light100;
  --bbva-form-toggle-input-card-container-bg-color: var(--colorsPrimaryCoreDark, ${r(t.primaryCoreDark)});
  --bbva-form-toggle-input-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-form-toggle-input-knob-tie-color: var(--colorsSecondary500, ${r(t.secondary500)});
  --bbva-form-toggle-input-checked-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-form-toggle-input-knob-tie-checked-color: var(--colorsPrimaryMedium, ${r(t.primaryMedium)});
  --bbva-form-toggle-input-card-container-pressed-bg-color: var(--colorsPrimaryCore, ${r(t.primaryCore)});
  --bbva-form-toggle-input-container-pressed-color: var(--colorsPrimaryCoreDark, ${r(t.primaryCoreDark)});
  --bbva-form-toggle-input-contrast-bg-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-form-toggle-input-contrast-pressed-bg-color: var(--colorsSecondary100, ${r(t.secondary100)});
  --bbva-form-toggle-input-contrast-control-bg-color: var(--colorsPrimaryMedium, ${r(t.primaryMedium)});
  --bbva-form-toggle-input-contrast-knob-tie-checked-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-form-toggle-input-contrast-icon-knob-tie-checked-bg-color: var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)});
  --bbva-form-toggle-input-contrast-icon-knob-tie-checked-color: var(--colorsPrimaryMedium, ${r(t.primaryMedium)});
  --bbva-form-toggle-input-card-bg-color: var(--colorsPrimaryCoreDark, ${r(t.primaryCoreDark)});
  --bbva-form-toggle-input-card-pressed-bg-color: var(--colorsPrimaryCoreDarkened, ${r(t.primaryCoreDarkened)});
  --bbva-form-toggle-input-card-contrast-pressed-checked-bg-color: var(--colorsSecondary100, ${r(t.secondary100)});
}
`}
  `,o`
    ${V}
  `;o`:host {
  display: inline-block;
  position: relative;
  font: inherit;
  box-sizing: border-box;
  width: 100%;
  cursor: pointer;
  font-size: var(--typographyTypeSmall, ${r(h.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${r(u.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${r(f.book.fontWeight)});
  --_form-togle-input-control-color: var(--bbva-form-toggle-input-dark-mode-color, var(--bbva-form-toggle-input-color,var(--colorsSecondary500, ${r(t.secondary500)})));
  --_form-toggle-input-control-checked-color: var(--bbva-form-toggle-input-dark-mode-checked--color, var(--bbva-form-toggle-input-checked-color,var(--colorsPrimaryMedium, ${r(t.primaryMedium)})));
  --_form-toggle-input-knob-tie-color: var(--bbva-form-toggle-input-dark-mode-knob-tie-color, var(--bbva-form-toggle-input-knob-tie-color,var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)})));
  --_form-toggle-input-knob-tie-checked-color: var(--bbva-form-toggle-input-dark-mode-knob-tie-checked-color, var(--bbva-form-toggle-input-knob-tie-checked-color,var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)})));
  --_form-toggle-input-container-pressed-color: var(--bbva-form-toggle-input-dark-mode-container-pressed-color, var(--bbva-form-toggle-input-container-pressed-color,var(--colorsSecondary100, ${r(t.secondary100)})));
  --_form-toggle-input-knob-tie-width: var(--bbva-form-toggle-input-tie-width, 1.375rem);
  --_form-togle-input-icon-knob-tie-color: var(--bbva-form-toggle-input-dark-mode-icon-knob-tie-color, var(--bbva-form-toggle-input-knob-tie-color,var(--colorsSecondary500, ${r(t.secondary500)})));
  --_form-toggle-input-card-bg-color: var(--bbva-form-toggle-input-dark-mode-card-bg-color, var(--bbva-form-toggle-input-card-bg-color, var(--colorsSecondary100, ${r(t.secondary100)})));
  --_form-toggle-input-card-pressed-bg-color: var(--bbva-form-toggle-input-dark-mode-card-pressed-bg-color, var(--bbva-form-toggle-input-card-pressed-bg-color, var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)})));
  --_form-toggle-input-card-contrast-pressed-checked-bg-color: var(--bbva-form-toggle-input-dark-mode-card-contrast-pressed-checked-bg-color, var(--bbva-form-toggle-input-card-contrast-pressed-checked-bg-color, var(--colorsPrimaryCoreDarkened, ${r(t.primaryCoreDarkened)})));
  --_form-toggle-input-contrast-bg-color: var(--bbva-form-toggle-input-dark-mode-contrast-bg-color, var(--bbva-form-toggle-input-contrast-bg-color,var(--colorsPrimaryCoreDark, ${r(t.primaryCoreDark)})));
  --_form-toggle-input-contrast-pressed-bg-color: var(--bbva-form-toggle-input-dark-mode-contrast-pressed-bg-color, var(--bbva-form-toggle-input-contrast-pressed-bg-color,var(--colorsPrimaryCoreDarkened, ${r(t.primaryCoreDarkened)})));
  --_form-toggle-input-contrast-control-bg-color: var(--bbva-form-toggle-input-dark-mode-contrast-control-bg-color, var(--bbva-form-toggle-input-contrast-control-bg-color,var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)})));
  --_form-toggle-input-contrast-knob-tie-checked-bg-color: var(--bbva-form-toggle-input-dark-mode-contrast-knob-tie-checked-color, var(--bbva-form-toggle-input-contrast-knob-tie-checked-color,var(--colorsPrimaryMedium, ${r(t.primaryMedium)})));
  --_form-toggle-input-contrast-icon-knob-tie-checked-bg-color: var(--bbva-form-toggle-input-dark-mode-contrast-icon-knob-tie-checked-bg-color, var(--bbva-form-toggle-input-contrast-icon-knob-tie-checked-bg-color,var(--colorsPrimaryMedium, ${r(t.primaryMedium)})));
  --_form-toggle-input-contrast-icon-knob-tie-checked-color: var(--bbva-form-toggle-input-dark-mode-contrast-icon-knob-tie-checked-color, var(--bbva-form-toggle-input-contrast-icon-knob-tie-checked-color,var(--colorsPrimaryCoreLightened, ${r(t.primaryCoreLightened)})));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
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

.container {
  display: flex;
  align-items: flex-start;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 16) * 1em);
}
:host([alignment=right]) .container {
  justify-content: space-between;
}

.bg {
  flex: none;
  position: relative;
  display: flex;
  justify-content: space-between;
  flex-wrap: nowrap;
  height: 1.5rem;
  width: 2.5rem;
  border-radius: 0.8125rem;
  background-color: var(--_form-togle-input-control-color);
  overflow: hidden;
}
:host([checked]) .bg {
  background-color: var(--_form-toggle-input-control-checked-color);
}

.knob {
  position: absolute;
  top: 0.0625rem;
  left: 0.0625rem;
  right: 0.0625rem;
  bottom: 0.0625rem;
  transition: transform 0.2s;
}
:host([checked]) .knob {
  transform: translateX(calc(100% - var(--_form-toggle-input-knob-tie-width)));
}
.knob-tie {
  display: block;
  height: 100%;
  width: var(--_form-toggle-input-knob-tie-width);
  border-radius: 0.8125rem;
  background-color: var(--_form-toggle-input-knob-tie-color);
}
:host([checked]) .knob-tie {
  background-color: var(--_form-toggle-input-knob-tie-checked-color);
}

:host([active]) {
  background-color: var(--_form-toggle-input-container-pressed-color);
}

:host([with-icon]) .bg {
  height: 2.5rem;
  width: 3.75rem;
  border-radius: 1.25rem;
}
:host([with-icon]) .bg .knob-tie {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100%;
  width: 2.25rem;
  border-radius: 1.25rem;
  color: var(--_form-togle-input-icon-knob-tie-color);
}

:host([with-icon][checked]) .bg .knob {
  transform: translateX(calc(100% - 36px));
}
:host([with-icon][checked]) .bg .knob-tie {
  background-color: var(--_form-toggle-input-knob-tie-checked-color);
  color: var(--_form-toggle-input-control-checked-color);
}

:host([variant=card]) {
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 16) * 1rem);
  box-shadow: var(--boxShadowType1, ${r(a.type1)});
  background-color: var(--_form-toggle-input-card-bg-color);
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 16) * 1em);
}
:host([variant=card]) .container {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 16) * 1em) 0;
}

:host([variant=card][active]) {
  background-color: var(--_form-toggle-input-card-pressed-bg-color);
}
:host([variant=card][active]) .container {
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

:host([with-contrast][checked][active]) {
  background-color: var(--_form-toggle-input-contrast-pressed-bg-color);
}

:host([with-contrast][with-icon][checked]) .bg .knob-tie {
  background-color: var(--_form-toggle-input-contrast-icon-knob-tie-checked-bg-color);
}
:host([with-contrast][with-icon][checked]) .bg .knob-tie [data-tag-name=bbva-icon] {
  fill: var(--_form-toggle-input-contrast-icon-knob-tie-checked-color);
}

:host([variant=card][with-contrast][active]) .container {
  background-color: var(--_form-toggle-pressed-input-card-contrast-pressed-bg-color);
}

:host([variant=card][with-contrast][active][checked]) {
  background-color: var(--_form-toggle-input-card-contrast-pressed-checked-bg-color);
}

::slotted([slot=right]) {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 16) * 1rem);
}

::slotted([slot=left]) {
  flex: 1;
  overflow: hidden;
}
`;n(l(_));var F={bbvaFormContainer:`\n  --bbva-form-container-dark-mode-help-icon-color: ${S("colors.primarySubdued")};\n  `},O={bbvaFormControlInput:`\n    --bbva-form-control-input-dark-mode-border-color: ${S("colors.primaryCoreLightened")};\n    --bbva-form-control-input-dark-mode-box-bg-color: ${S("colors.cool70")};\n    --bbva-form-control-input-dark-mode-check-color: ${S("colors.primaryMediumLight")};\n\n    --bbva-form-control-input-dark-mode-container-pressed-bg-color: ${S("colors.cool60")};\n    --bbva-form-control-input-dark-mode-pressed-box-bg-color: ${S("colors.cool70")};\n    \n    \n    --bbva-form-control-input-dark-mode-card-bg-color: ${S("colors.cool60")};\n    --bbva-form-control-input-dark-mode-card-box-bg-color: ${S("colors.cool70")};\n    --bbva-form-control-input-dark-mode-card-pressed-bg-color: ${S("colors.cool80")};\n    --bbva-form-control-input-dark-mode-card-box-pressed-bg-color:  ${S("colors.cool70")};\n    \n    \n    --bbva-form-control-input-dark-mode-card-contrast-bg-color: ${S("colors.cool60")};\n    --bbva-form-control-input-dark-mode-card-contrast-box-bg-color: ${S("colors.cool70")};\n    \n    --bbva-form-control-input-dark-mode-contrast-bg-color: ${S("colors.cool60")};\n    --bbva-form-control-input-dark-mode-contrast-box-bg-color: ${S("colors.cool70")};\n    --bbva-form-control-input-dark-mode-contrast-pressed-bg-color:  ${S("colors.cool80")};\n    --bbva-form-control-input-dark-mode-contrast-border-color:  ${S("colors.primaryCoreLightened")};\n    --bbva-form-control-input-dark-mode-contrast-check-color: ${S("colors.primaryMediumLight")};\n    --bbva-form-control-input-dark-mode-contrast-check-bg-color: ${S("colors.primaryMediumLight")};\n\n  `};S("colors.primaryCoreLightened"),S("colors.primaryCoreLightened"),S("colors.cool50"),S("colors.primaryMedium"),S("colors.cool40"),S("colors.primaryCoreLightened"),S("colors.cool60"),S("colors.cool80"),S("colors.cool80"),S("colors.cool60"),S("colors.cool80"),S("colors.primaryCoreLightened"),S("colors.cool50"),S("colors.primaryMedium"),S("colors.primaryCoreLightened");export{z as B,T as a,M as b,I as c,F as d,O as e};
