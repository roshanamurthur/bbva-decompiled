import{z as t,aS as e,by as o,ak as r,h as a,ai as i,an as n,L as c,aV as b,i as s,bm as l,bn as u,av as d}from"./952f98a9.js";import{R as m,S as p,u as g,T as h,D as v,a1 as y,v as k,x as _,G as f,a2 as S,z as $,O as w,V as x,W as A,H as P,P as C,f as L}from"./216055dc.js";var B=t`
:host .wrapper {
  position: relative;
  display: flex;
  width: auto;
  height: 3rem;
  box-sizing: border-box;
  align-items: center;
  justify-content: center;
  padding: 0.75rem 1rem;
  border-radius: 6.25rem;
  background-color: var(--_button-group-item-bg-color);
  cursor: pointer;
  opacity: 1;
  user-select: none;
  vertical-align: middle;
}

:host([show-check]) .wrapper {
  min-width: var(--button-group-item-min-width, 0);
}

[data-tag-name=bbva-type-icon].checked {
  min-width: 1rem;
  margin-right: 0.25rem;
}

.oval {
  width: 1rem;
  min-width: 1rem;
  height: 1rem;
  border: 0.125rem solid var(--_button-group-item-color);
  border-radius: 50%;
  margin-right: 0.25rem;
}

[data-tag-name=bbva-type-text] {
  min-width: 0;
  --bbva-type-text-white-space: nowrap;
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

:host(:focus) {
  outline: none;
}

:host([aria-checked=true]) .wrapper {
  background-color: var(--_button-group-item-bg-color-checked);
}
:host([aria-checked=true]) .wrapper [data-tag-name=bbva-type-icon] {
  fill: var(--_button-group-item-color-checked);
}
:host([aria-checked=true]) .wrapper [data-tag-name=bbva-type-text] {
  color: var(--_button-group-item-color-checked);
}
:host([aria-checked=true]) .wrapper [data-tag-name=bbva-type-amount] {
  color: var(--_button-group-item-color-checked);
}

:host([aria-checked=true][active]:not([disabled])) .wrapper {
  background-color: var(--_button-group-item-bg-color-checked-pressed);
}
:host([aria-checked=true][active]:not([disabled])) .wrapper [data-tag-name=bbva-type-text] {
  color: var(--_button-group-item-color-checked-pressed);
}
:host([aria-checked=true][active]:not([disabled])) .wrapper [data-tag-name=bbva-type-icon] {
  fill: var(--_button-group-item-color-checked-pressed);
}

:host([aria-checked=false][active]:not([disabled])) .wrapper {
  background-color: var(--_button-group-item-bg-color-pressed);
}
:host([aria-checked=false][active]:not([disabled])) .wrapper [data-tag-name=bbva-type-icon] {
  fill: var(--_button-group-item-color-pressed);
}
:host([aria-checked=false][active]:not([disabled])) .wrapper [data-tag-name=bbva-type-text] {
  color: var(--_button-group-item-color-pressed);
}
:host([aria-checked=false][active]:not([disabled])) .wrapper .oval {
  border: 0.125rem solid var(--_button-group-item-color-pressed);
}

:host([focus-visible]:not([disabled])) {
  outline: 0.125rem solid var(--_button-group-item-focus-border-color);
  outline-offset: 0.25rem;
}

:host([icon]) .wrapper {
  width: 3rem;
  min-width: var(--bbva-button-group-item-min-width, 0);
  height: 3rem;
  flex-basis: auto;
  justify-content: center;
  padding: 0.75rem;
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

:host([small]) .wrapper {
  height: 2.5rem;
  padding: 0.5rem 1rem;
}

:host([stacked]) .wrapper {
  width: 2.5rem;
  height: 2.5rem;
  flex-basis: auto;
  flex-grow: 0;
}
:host([stacked]) .wrapper [data-tag-name=bbva-type-text] {
  min-width: auto;
}

:host([has-ellipsis]) .wrapper {
  max-width: 6.3125rem;
  flex-basis: 0;
}
`,I=t`
:host {
  --_button-group-item-bg-color:
    var(--bbva-button-group-item--_ambient--bg-color,
      var(--bbva-button-group-item--custom--primary-ambient--bg-color,
        ${m("colorPrimarySurfaceAlternativeDefault",p)}));
  --_button-group-item-bg-color-checked:
    var(--bbva-button-group-item--_ambient--bg-color-checked,
      var(--bbva-button-group-item--custom--primary-ambient--bg-color-checked,
        ${m("colorPrimarySelectionInteraction01BackgroundSelected",p)}));
  --_button-group-item-bg-color-pressed:
    var(--bbva-button-group-item--_ambient--bg-color-pressed,
      var(--bbva-button-group-item--custom--primary-ambient--bg-color-pressed,
        ${m("colorPrimarySurfaceAlternativePressed",p)}));
  --_button-group-item-bg-color-checked-pressed:
    var(--bbva-button-group-item--_ambient--bg-color-checked-pressed,
      var(--bbva-button-group-item--custom--primary-ambient--bg-color-checked-pressed,
        ${m("colorPrimarySelectionInteraction01BackgroundSelectedPressed",p)}));
  --_button-group-item-color:
    var(--bbva-button-group-item--_ambient--color,
      var(--bbva-button-group-item--custom--primary-ambient--color,
        ${m("colorPrimaryLinkComplementaryDefault",p)}));
  --_button-group-item-color-checked:
    var(--bbva-button-group-item--_ambient--color-checked,
      var(--bbva-button-group-item--custom--primary-ambient--color-checked,
        ${m("colorPrimarySelectionInteraction01TextSelected",p)}));
  --_button-group-item-color-pressed:
    var(--bbva-button-group-item--_ambient--color-pressed,
      var(--bbva-button-group-item--custom--primary-ambient--color-pressed,
        ${m("colorPrimaryLinkComplementaryPressed",p)}));
  --_button-group-item-color-checked-pressed:
    var(--bbva-button-group-item--_ambient--color-checked-pressed,
      var(--bbva-button-group-item--custom--primary-ambient--color-checked-pressed,
        ${m("colorPrimarySelectionInteraction01TextSelectedPressed",p)}));
  --_button-group-item-focus-border-color:
    var(--bbva-button-group-item--_ambient--focus-border-color,
       var(--bbva-button-group-item--custom--primary-ambient--focus-border-color,
        ${m("colorPrimarySurfaceAmbientFocus",p)}));
}
`;const D=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-button-group-item--_ambient--bg-color: initial;
    --bbva-button-group-item--_ambient--bg-color-checked: initial;
    --bbva-button-group-item--_ambient--bg-color-pressed: initial;
    --bbva-button-group-item--_ambient--bg-color-checked-pressed: initial;
    --bbva-button-group-item--_ambient--color: initial;
    --bbva-button-group-item--_ambient--color-checked: initial;
    --bbva-button-group-item--_ambient--color-pressed: initial;
    --bbva-button-group-item--_ambient--color-checked-pressed: initial;
    --bbva-button-group-item--_ambient--focus-border-color: initial;
  }
`,z=t`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-button-group-item--_ambient--bg-color: var(
      --bbva-button-group-item--custom--primary-alt-ambient--bg-color,
      ${m("colorPrimaryAltSurfaceAlternativeDefault",p)}
    );

    --bbva-button-group-item--_ambient--bg-color-checked: var(
      --bbva-button-group-item--custom--primary-alt-ambient--bg-color-checked,
      ${m("colorPrimaryAltSelectionInteraction01BackgroundSelected",p)}
    );

    --bbva-button-group-item--_ambient--bg-color-pressed: var(
      --bbva-button-group-item--custom--primary-alt-ambient--bg-color-pressed,
      ${m("colorPrimaryAltSurfaceAlternativePressed",p)}
    );

    --bbva-button-group-item--_ambient--bg-color-checked-pressed: var(
      --bbva-button-group-item--custom--primary-alt-ambient--bg-color-checked-pressed,
      ${m("colorPrimaryAltSelectionInteraction01BackgroundSelectedPressed",p)}
    );

    --bbva-button-group-item--_ambient--color: var(
      --bbva-button-group-item--custom--primary-alt-ambient--color,
      ${m("colorPrimaryAltLinkComplementaryDefault",p)}
    );

    --bbva-button-group-item--_ambient--color-checked: var(
      --bbva-button-group-item--custom--primary-alt-ambient--color-checked,
      ${m("colorPrimaryAltSelectionInteraction01TextSelected",p)}
    );

    --bbva-button-group-item--_ambient--color-pressed: var(
      --bbva-button-group-item--custom--primary-alt-ambient--color-pressed,
      ${m("colorPrimaryAltLinkComplementaryPressed",p)}
    );

    --bbva-button-group-item--_ambient--color-checked-pressed: var(
      --bbva-button-group-item--custom--primary-alt-ambient--color-checked-pressed,
      ${m("colorPrimaryAltSelectionInteraction01TextSelectedPressed",p)}
    );

    --bbva-button-group-item--_ambient--focus-border-color: var(
      --bbva-button-group-item--custom--primary-alt-ambient--focus-border-color,
      ${m("colorPrimaryAltSurfaceAmbientFocus",p)});
  }
`,j=t`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-button-group-item--_ambient--bg-color: var(
      --bbva-button-group-item--custom--secondary-ambient--bg-color,
      ${m("colorSecondarySurfaceAlternativeDefault",p)}
    );

    --bbva-button-group-item--_ambient--bg-color-checked: var(
      --bbva-button-group-item--custom--secondary-ambient--bg-color-checked,
      ${m("colorSecondarySelectionInteraction01BackgroundSelected",p)}
    );

    --bbva-button-group-item--_ambient--bg-color-pressed: var(
      --bbva-button-group-item--custom--secondary-ambient--bg-color-pressed,
      ${m("colorSecondarySurfaceAlternativePressed",p)}
    );

    --bbva-button-group-item--_ambient--bg-color-checked-pressed: var(
      --bbva-button-group-item--custom--secondary-ambient--bg-color-checked-pressed,
      ${m("colorSecondarySelectionInteraction01BackgroundSelectedPressed",p)}
    );

    --bbva-button-group-item--_ambient--color: var(
      --bbva-button-group-item--custom--secondary-ambient--color,
      ${m("colorSecondaryLinkComplementaryDefault",p)}
    );

    --bbva-button-group-item--_ambient--color-checked: var(
      --bbva-button-group-item--custom--secondary-ambient--color-checked,
      ${m("colorSecondarySelectionInteraction01TextSelected",p)}
    );

    --bbva-button-group-item--_ambient--color-pressed: var(
      --bbva-button-group-item--custom--secondary-ambient--color-pressed,
      ${m("colorSecondaryLinkComplementaryPressed",p)}
    );

    --bbva-button-group-item--_ambient--color-checked-pressed: var(
      --bbva-button-group-item--custom--secondary-ambient--color-checked-pressed,
      ${m("colorSecondarySelectionInteraction01TextSelectedPressed",p)}
    );
    --bbva-button-group-item--_ambient--focus-border-color: var(
      --bbva-button-group-item--custom--secondary-ambient--focus-border-color,
      ${m("colorSecondarySurfaceAmbientFocus",p)});
  }
`,E=t`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-button-group-item--_ambient--bg-color: var(
      --bbva-button-group-item--custom--secondary-alt-ambient--bg-color,
      ${m("colorSecondaryAltSurfaceAlternativeDefault",p)}
    );

    --bbva-button-group-item--_ambient--bg-color-checked: var(
      --bbva-button-group-item--custom--secondary-alt-ambient--bg-color-checked,
      ${m("colorSecondaryAltSelectionInteraction01BackgroundSelected",p)}
    );

    --bbva-button-group-item--_ambient--bg-color-pressed: var(
      --bbva-button-group-item--custom--secondary-alt-ambient--bg-color-pressed,
      ${m("colorSecondaryAltSurfaceAlternativePressed",p)}
    );

    --bbva-button-group-item--_ambient--bg-color-checked-pressed: var(
      --bbva-button-group-item--custom--secondary-alt-ambient--bg-color-checked-pressed,
      ${m("colorSecondaryAltSelectionInteraction01BackgroundSelectedPressed",p)}
    );

    --bbva-button-group-item--_ambient--color: var(
      --bbva-button-group-item--custom--secondary-alt-ambient--color,
      ${m("colorSecondaryAltLinkComplementaryDefault",p)}
    );

    --bbva-button-group-item--_ambient--color-checked: var(
      --bbva-button-group-item--custom--secondary-alt-ambient--color-checked,
      ${m("colorSecondaryAltSelectionInteraction01TextSelected",p)}
    );

    --bbva-button-group-item--_ambient--color-pressed: var(
      --bbva-button-group-item--custom--secondary-alt-ambient--color-pressed,
      ${m("colorSecondaryAltLinkComplementaryPressed",p)}
    );

    --bbva-button-group-item--_ambient--color-checked-pressed: var(
      --bbva-button-group-item--custom--secondary-alt-ambient--color-checked-pressed,
      ${m("colorSecondaryAltSelectionInteraction01TextSelectedPressed",p)}
    );

    --bbva-button-group-item--_ambient--focus-border-color: var(
      --bbva-button-group-item--custom--secondary-alt-ambient--focus-border-color,
      ${m("colorSecondaryAltSurfaceAmbientFocus",p)});
  }
`;const T=g([Object.freeze({__proto__:null,primary:D,primaryAlt:z,secondary:j,secondaryAlt:E}),h,v,y]),R=Object.values(T);class W extends(k(e(o))){static get is(){return"bbva-button-group-item"}static get scopedElements(){return{"bbva-type-icon":_,"bbva-type-text":f,"bbva-type-amount":S}}static get properties(){return{text:{type:String},icon:{type:String,reflect:!0},iconSize:{type:Number,attribute:"icon-size"},iconAccessibilityText:{type:String,attribute:"icon-accessibility-text"},small:{type:Boolean,reflect:!0},hasEllipsis:{type:Boolean,reflect:!0,attribute:"has-ellipsis"},stacked:{type:Boolean,reflect:!0},disabled:{type:Boolean},checked:{type:Boolean,reflect:!0},showCheck:{type:Boolean,attribute:"show-check"}}}constructor(){super(),this.small=!1,this.hasEllipsis=!1,this.disabled=!1,this.iconSize=24,this.showCheck=!1,this.iconAccessibilityText="",this.stacked=!1}static get styles(){return[super.styles,I,B,R,r("bbva-button-group-item-shared-styles")]}get _renderCheck(){return!this.stacked&&this.showCheck?this.checked?a`<bbva-type-icon class="checked" .icon="${i()}" size="16"></bbva-type-icon>`:a`<span class="oval"></span>`:""}get _buttonContent(){return a`
      <div class="wrapper">
        <span class="${this.icon?"sr-only":""}">${this.iconAccessibilityText}</span>
        ${this.icon?a` <bbva-type-icon .icon="${this.icon}" .size="${this.iconSize}"></bbva-type-icon> `:""}
        ${this.text&&!this.amount?a`
              ${this._renderCheck}
              <bbva-type-text
                tag="label"
                unset
                text="${this.text}"
                size="S"
                font-weight="500"
                ?ellipsis="${this.hasEllipsis}"
              ></bbva-type-text>
            `:this.amount&&a`<bbva-type-amount
              type="bold"
              amount="${this.amount}"
              variant="m"
              currency-code="${this.currencyCode}"
              local-currency="${this.localCurrency}"
              language="${this.language}"
            ></bbva-type-amount>`}
      </div>
    `}render(){return a`${this._control} ${this._buttonContent} `}}var O=t`
:host {
  position: relative;
  display: block;
  width: 100%;
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

.buttons {
  display: flex;
  width: 100%;
  flex-wrap: wrap;
  padding: 0;
  margin: 0;
  gap: 0.5rem;
  list-style: none;
}

li {
  display: contents;
}

.group {
  display: flex;
  box-sizing: border-box;
  align-items: center;
  margin: 0;
  list-style: none;
}

.scroll {
  padding: 0.375rem;
  padding-right: 4rem;
  -webkit-overflow-scrolling: touch;
  overflow-x: auto;
  scrollbar-width: none;
}
.scroll::-webkit-scrollbar {
  display: none;
}

.right-padding-fix:after {
  display: block;
  width: 1rem;
  border: 1px solid transparent;
  content: "";
}

.gradient.left::before, .gradient.right::after {
  position: absolute;
  top: 0;
  left: 0;
  width: 4rem;
  height: 100%;
  background: linear-gradient(to right, var(--_button-group-gradient-background) 0%, rgba(255, 255, 255, 0) 100%);
  content: "";
  pointer-events: none;
}
.gradient.right::after {
  right: 0;
  left: auto;
  transform: rotate(180deg);
}
.gradient.desktop.left::before, .gradient.desktop.right::after {
  width: 5rem;
  background: linear-gradient(to right, var(--_button-group-gradient-background) 50%, rgba(255, 255, 255, 0) 100%);
}

.scroll-icons {
  --bbva-button-default--_ambient--icon-no-background-color: var(--_button-group-icon-color);
  --bbva-button-default--_ambient--icon-no-background-color-active: var(--_button-group-icon-color-active);
}
.scroll-icons .icon-left {
  position: absolute;
  z-index: 1;
  top: calc(50% - 24px);
  left: 0.5rem;
}
.scroll-icons .icon-right {
  position: absolute;
  z-index: 1;
  top: calc(50% - 24px);
  right: 0.5rem;
}

[data-tag-name=bbva-type-date] {
  flex: 0 0 auto;
  padding-right: 1rem;
  white-space: nowrap;
}

[data-tag-name=bbva-type-link] {
  flex-grow: 1;
  text-align: right;
  white-space: nowrap;
}

.no-wrap {
  flex-wrap: nowrap;
  align-items: center;
}

:host([date]) .list {
  width: auto;
  min-width: 0;
  flex-wrap: nowrap;
  justify-content: flex-end;
}
:host([date]) .group {
  width: 100%;
  justify-content: space-between;
}

:host([stacked]) .buttons {
  display: inline-flex;
  flex-flow: row wrap;
  justify-content: start;
}
:host([stacked]) li {
  flex-grow: 0;
}

:host([center]) .buttons {
  display: inline-flex;
  flex-flow: row wrap;
  justify-content: center;
}
:host([center]) li {
  flex-grow: 0;
}

:host([link]) .group {
  gap: 1rem;
}
:host([link]) .scroll .buttons {
  width: auto;
}
:host([link]) [data-tag-name=bbva-button-group-item] {
  min-width: auto;
}

:host([align-left-link]) .buttons {
  width: auto;
}
:host([align-left-link]) [data-tag-name=bbva-type-link] {
  flex-grow: 0;
}
`,q=t`
:host {
  --_button-group-gradient-background:
    var(--bbva-button-group--_ambient--gradient-background,
      var(--bbva-button-group--custom--primary-ambient--gradient-background,
        ${m("colorPrimarySurfaceAmbientDefault",p)}));
  --_button-group-icon-color:
    var(--bbva-button-group--_ambient--icon-color,
      var(--bbva-button-group--custom--primary-ambient--icon-color,
        ${m("colorPrimaryLinkComplementaryDefault",p)}));
  --_button-group-icon-color-active:
    var(--bbva-button-group--_ambient--icon-color-active,
      var(--bbva-button-group--custom--primary-ambient--icon-color-active,
        ${m("colorPrimaryLinkComplementaryPressed",p)}));
}
`;const F=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-button-group--_ambient--gradient-background: initial;
    --bbva-button-group--_ambient--icon-color: initial;
    --bbva-button-group--_ambient--icon-color-active: initial;
  }
`,G=t`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-button-group--_ambient--gradient-background: var(
      --bbva-button-group--custom--primary-alt-ambient--gradient-background,
      ${m("colorPrimaryAltSurfaceAmbientDefault",p)}
    );
    --bbva-button-group--_ambient--icon-color: var(
      --bbva-button-group--custom--primary-alt-ambient--icon-color,
      ${m("colorPrimaryAltLinkComplementaryDefault",p)}
    );
    --bbva-button-group--_ambient--icon-color-active: var(
      --bbva-button-group--custom--primary-alt-ambient--icon-color-active,
      ${m("colorPrimaryAltLinkComplementaryPressed",p)}
    );
  }
`,H=t`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-button-group--_ambient--gradient-background: var(
      --bbva-button-group--custom--secondary-ambient--gradient-background,
      ${m("colorSecondarySurfaceAmbientDefault",p)}
    );
    --bbva-button-group--_ambient--icon-color: var(
      --bbva-button-group--custom--secondary-ambient--icon-color,
      ${m("colorSecondaryLinkComplementaryDefault",p)}
    );
    --bbva-button-group--_ambient--icon-color-active: var(
      --bbva-button-group--custom--secondary-ambient--icon-color-active,
      ${m("colorSecondaryLinkComplementaryPressed",p)}
    );
  }
`,N=t`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-button-group--_ambient--gradient-background: var(
      --bbva-button-group--custom--secondary-alt-ambient--gradient-background,
      ${m("colorSecondaryAltSurfaceAmbientDefault",p)}
    );
    --bbva-button-group--_ambient--icon-color: var(
      --bbva-button-group--custom--secondary-alt-ambient--icon-color,
      ${m("colorSecondaryAltLinkComplementaryDefault",p)}
    );
    --bbva-button-group--_ambient--icon-color-active: var(
      --bbva-button-group--custom--secondary-alt-ambient--icon-color-active,
      ${m("colorSecondaryAltLinkComplementaryPressed",p)}
    );
  }
`;const V=g([Object.freeze({__proto__:null,primary:F,primaryAlt:G,secondary:H,secondaryAlt:N}),T,$,w,x]),M=Object.values(V);class Q extends(k(n(A(c)))){static get is(){return"bbva-button-group"}static get scopedElements(){return{"bbva-button-group-item":W,"bbva-type-link":P,"bbva-type-date":C,"bbva-button-default":L}}static get properties(){return{name:{type:String,reflect:!0},items:{type:Array},selected:{type:Number,reflect:!0},date:{type:String},fontStyleDate:{type:String,attribute:"font-style-date"},fontWeightDate:{type:String,attribute:"font-weight-date"},options:{type:Object},locale:{type:String},link:{type:String},_availableScroll:{type:String},_scrollable:{type:Boolean},stacked:{type:Boolean},center:{type:Boolean},type:{type:String},hasEllipsis:{type:Boolean,attribute:"has-ellipsis"},small:{type:Boolean},showCheck:{type:Boolean,attribute:"show-check"},alignLeftLink:{type:Boolean,attribute:"align-left-link"},disabled:{type:Boolean},_desktop:{type:Boolean,attribute:!1}}}constructor(){super(),this.stacked=!1,this.center=!1,this.disabled=!1,this.date="",this.link="",this.items=[],this._scrollable=!1,this.selected=-1,this.type="checkbox",this.name=`button-group-${((t=10)=>`${Math.random().toString(36).substring(2,t)}`)()}`,this.alignLeftLink=!1,this.fontStyleDate="italic",this.fontWeightDate="500",this.hasEllipsis=!1,this.small=!1,this.showCheck=!1,this.alignLeftLink=!1}static get styles(){return[q,O,M,r("bbva-button-group-shared-styles")]}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)"}}connectedCallback(){if(super.connectedCallback&&super.connectedCallback(),!this.getAttribute("role")){const t={checkbox:"group",radio:"radiogroup"};this.role=t[this.type]}}async updated(t){super.updated&&super.updated(t),t.has("disabled")&&this.setAttribute("aria-disabled",this.disabled),this._items.length&&(t.has("selected")&&Number.isFinite(this.selected)&&this.selected>-1&&(this._items[this.selected].checked=!0),(this.date||this.link)&&this._setSmallItems(),await this.updateComplete,this._scrollable=this._isScrollable(),this._onStepsScroll())}_setSmallItems(){this._items.forEach((t=>{t.getAttribute("small")||t.getAttribute("icon")||t.setAttribute("small","")}))}_isScrollable(){var t;const e=null===(t=this.shadowRoot)||void 0===t?void 0:t.querySelector(".group");return this._items&&(e.scrollHeight>e.clientHeight||e.scrollWidth>e.clientWidth)}get _items(){var t;const e=(null===(t=this.items)||void 0===t?void 0:t.length)>0?this.shadowRoot:this;return Array.from(e.querySelectorAll('[data-tag-name="bbva-button-group-item"]'))}get _renderList(){return this.date?a`
        <bbva-type-date
          ?disabled="${this.disabled}"
          date="${this.date}"
          .options="${this.options}"
          .locale="${this.locale}"
          font-weight="${this.fontWeightDate}"
          font-style="${this.fontStyleDate}"
        ></bbva-type-date>
      `:b}get _renderArray(){return a`
      ${this.items.map((t=>a`
          <li>
            <bbva-button-group-item
              ?has-ellipsis="${this.hasEllipsis}"
              ?disabled="${this.disabled}"
              ?show-check="${this.showCheck}"
              type="${this.type}"
              name="${this.name}"
              icon="${s(t.icon)}"
              icon-accessibility-text="${s(this.t(t.iconAccessibilityText))}"
              value="${s(t.value)}"
              .localCurrency="${t.localCurrency}"
              .currencyCode="${t.currencyCode}"
              .language="${t.language}"
              ?small="${this.small}"
              ?checked="${t.checked}"
              .text="${this.t(t.text)}"
              .amount="${t.amount}"
              ?stacked="${this.stacked}"
              @change="${this._updateItems}"
            ></bbva-button-group-item>
          </li>
        `))}
    `}get _renderGradient(){return a`
      <div
        class="${this._scrollable&&(this._items.length>3||this.link)?"gradient":""} ${this._availableScroll} ${this._desktop?"desktop":""}"
      ></div>
    `}get _renderButtons(){return this.items.length>0?this._renderArray:b}get _renderLink(){return this.link?a`<bbva-type-link ?disabled="${this.disabled}" @click="${this._linkClick}">
        ${this.link}
      </bbva-type-link>`:b}_checkListLength(){return this._items.length>=1&&this._items.length<=2}_updateItems(t){var e,o;const r="radio"===this.type;let a="";r&&(a=this._items.indexOf(null==t?void 0:t.target),this.selected=a),this.dispatchEvent(new CustomEvent("button-group-item-change",{detail:{value:null==t||null===(e=t.target)||void 0===e?void 0:e.value,...r?{selected:a}:{checked:null==t||null===(o=t.target)||void 0===o?void 0:o.checked}},bubbles:!0,composed:!0}))}_linkClick(){this.dispatchEvent(new CustomEvent("button-group-link-click",{detail:!0,bubbles:!0,composed:!0}))}_onStepsScroll(){const{scrollLeft:t,scrollWidth:e,offsetWidth:o}=this.shadowRoot.querySelector(".group");this._availableScroll=0===t?"right":t+o>=e?"left":"left right"}_clickRightScroll(){this.shadowRoot.querySelector(".group").scrollBy({left:50,behavior:"smooth"})}_clickLeftScroll(){this.shadowRoot.querySelector(".group").scrollBy({left:-50,behavior:"smooth"})}_renderScrollIcon(t){const e="left"===t?l():u(),o="left"===t?this._clickLeftScroll:this._clickRightScroll;return a` <bbva-button-default
      ?disabled="${this.disabled}"
      variant="icon no-background"
      class="icon-${t}"
      icon=${e}
      @click=${o}
      aria-label="${this.t(`bbva-button-scroll-${t}`)}"
    ></bbva-button-default>`}_renderScrollIcons(){var t,e;return a`
      <div class="scroll-icons">
        ${null!==(t=this._availableScroll)&&void 0!==t&&t.includes("left")?this._renderScrollIcon("left"):b}
        ${null!==(e=this._availableScroll)&&void 0!==e&&e.includes("right")?this._renderScrollIcon("right"):b}
      </div>
    `}render(){return a`
      ${this._desktop&&this._scrollable?this._renderScrollIcons():b}
      <div
        class="group ${d({scroll:this._items.length>2&&this.link})}"
        @scroll="${this._onStepsScroll}"
      >
        ${this._checkListLength()?this._renderList:b}
        <ul class="buttons ${d({"no-wrap":this.link,list:this.date})}">
          ${this._renderButtons}
        </ul>
        ${this._renderLink}
      </div>
      ${this._scrollable?this._renderGradient:b}
    `}}export{Q as B,V as b};
