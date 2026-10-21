import{z as t,a8 as a,ar as i,ac as e,ad as o,ab as r,a9 as n,aa as c,b_ as s,a as l,aJ as b,cE as d,F as p,cF as g,b$ as v,ak as h,bx as m,h as u,bt as y,c0 as $,cG as S,g as f,a$ as k,L as x,af as w,b5 as z}from"./952f98a9.js";const _=new i;var P=t`:host {
  cursor: pointer;
  display: flex;
  box-sizing: border-box;
  flex-direction: column;
  align-items: center;
  text-align: center;
  max-width: var(--bbva-button-action-max-width, 4.125rem);
  font-size: var(--typographyType3XSmall, ${a(e.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${a(o.type3XSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${a(r.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${a(r.medium.fontStyle)});
  --_button-action-color: var(--bbva-button-action-dark-mode-color, var(--bbva-button-action-color, var(--colorsPrimaryMedium, ${a(n.primaryMedium)})));
  --_button-action-active-color: var(--bbva-button-action-active-dark-mode-color, var(--bbva-button-action-active-color, var(--colorsPrimaryCoreDark, ${a(n.primaryCoreDark)})));
  --_dark-display: var(--bbva-button-action-card-logo-dark-mode-dark-display, var(--bbva-button-action-card-logo-dark-display, none));
  --_light-display: var(--bbva-button-action-card-logo-dark-mode-light-display, var(--bbva-button-action-card-logo-light-display, inline));
}

:host(:not([href])) {
  border: none;
  border-radius: 0;
  color: var(--_button-action-color);
}
:host(:not([href]))[active]:not([aria-disabled=true]) {
  background-color: transparent;
}

:host([disabled]) {
  opacity: 0.4;
  cursor: default;
  pointer-events: none;
}

[data-tag-name=bbva-icon] {
  fill: var(--_button-action-color);
}

:host(:not([href])[active]:not([aria-disabled=true])) {
  background-color: transparent;
  color: var(--_button-action-active-color);
}
:host(:not([href])[active]:not([aria-disabled=true])) [data-tag-name=bbva-icon] {
  fill: var(--_button-action-active-color);
}

.app-pay-icon svg {
  height: 1.5rem;
  max-width: 3rem;
}
.app-pay-icon svg .dark, .app-pay-icon svg.dark {
  display: var(--_dark-display);
}
.app-pay-icon svg .light, .app-pay-icon svg.light {
  display: var(--_light-display);
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

label {
  cursor: pointer;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-badge-notification] {
  --_margin-left: 0;
}

@supports (-webkit-line-clamp: 3) {
  label {
    overflow: hidden;
    text-overflow: ellipsis;
    display: -webkit-box;
    -webkit-line-clamp: 3;
    -webkit-box-orient: vertical;
  }
}
${_.mediaRules()}`;var V=t`[ambient^=light] {
  --bbva-button-action-color: initial;
  --bbva-button-action-active-color: initial;
  --bbva-button-action-card-logo-dark-display: none;
  --bbva-button-action-card-logo-light-display: initial;
}
${(new i).mediaRules()}`;const C=new i;const I={dark:t`
    ${t`[ambient^=dark] {
  --bbva-button-action-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
  --bbva-button-action-active-color: var(--colorsPrimarySubduedLight, ${a(n.primarySubduedLight)});
  --bbva-button-action-card-logo-dark-display: inline;
  --bbva-button-action-card-logo-light-display: none;
}
${C.mediaRules()}`}
    ${s.dark}
  `,light:t`
    ${V}
    ${s.light}
  `};class L extends(l(b(d))){static get is(){return"bbva-button-action"}static get scopedElements(){return{"bbva-icon":p,"bbva-core-image":g,"bbva-badge-notification":v}}static get properties(){return{icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},appPayIcon:{type:String,attribute:"app-pay-icon"},imageAltText:{type:String,attribute:"image-alt-text"},label:{type:String},notifications:{type:Number},notificationsVariant:{type:String,attribute:"notifications-variant"},notificationsPosition:{type:String,attribute:"notifications-position"},notificationsAccesibilityText:{type:String}}}constructor(){super(),this.iconSize=24,this.icon="",this.image="",this.imageAltText="",this.notificationsPosition="right",this.appPayIcon=""}static get styles(){return[super.styles,P,h("bbva-button-action-shared-styles"),m(),I.light,I.dark]}get _imageWidth(){return 2*this.iconSize}get getIcon(){return this.icon?u`
        <bbva-icon onclick="void(0)" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>
      `:this.appPayIcon?u`<div class="app-pay-icon">${y[this.appPayIcon]}</div>`:u`
        <bbva-core-image
          .src="${this.image}"
          .alt="${this.imageAltText}"
          sizing="contain"
          .width="${this._imageWidth}"
          .height="${this.iconSize}"
          onclick="void(0)"
          position="center"
        ></bbva-core-image>
      `}render(){return u`
      ${this.notifications?u`
            <bbva-badge-notification
              ambient="light"
              .accessibilityText="${this.notificationsAccesibilityText}"
              .text="${this.notifications}"
              .position="${this.notificationsPosition}"
              .variant="${this.notificationsVariant}"
              >${this.getIcon}
            </bbva-badge-notification>
          `:u` ${this.getIcon} `}
      <label onclick="void(0)"> ${this.label} </label>
      <slot></slot>
      ${this._action}
    `}}f("colors.primarySubdued"),f("colors.primaryCoreLight");const T=new i;var A=t`:host {
  display: block;
  box-sizing: border-box;
  --_icon-close-color: var(--bbva-button-operations-icon-close-color, var(--colorsSecondary600, ${a(n.secondary600)}));
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

.close-icon {
  display: flex;
  justify-content: flex-end;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}
.close-icon .icon-item {
  border: none;
  background: none;
  width: 1.5rem;
  padding: 0;
  color: var(--_icon-close-color);
  margin: 0;
  outline: none;
}

[data-tag-name=bbva-header-category] {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}

.buttons {
  display: flex;
  justify-content: start;
  align-items: start;
  flex-wrap: wrap;
  padding-bottom: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-button-action] {
  min-width: 5.5rem;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
  width: 33.33%;
  max-width: 33.33%;
}
[data-tag-name=bbva-button-action]:nth-child(3n+1) {
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}
[data-tag-name=bbva-button-action]:nth-child(3n) {
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}
${T.mediaRules()}`,E=t`[ambient^=light] {
  --bbva-button-operations-icon-close-color: initial;
}
`;const F={dark:t`
    ${t`[ambient^=dark] {
  --bbva-button-operations-icon-close-color: var(--colorsPrimaryCoreLightened, ${a(n.primaryCoreLightened)});
}
`}
    ${I.dark}
    ${k.dark}
  `,light:t`
    ${E}
    ${I.light}
    ${k.light}
  `};class M extends(l(x)){static get is(){return"bbva-button-operations"}static get scopedElements(){return{"bbva-button-action":L,"bbva-core-icon":w,"bbva-header-category":z}}static get properties(){return{categoryHeader:{type:String,attribute:"category-header"},closeIcon:{type:String,attribute:"close-icon"},iconSize:{type:Number,attribute:"icon-size"},closeLabel:{type:String,attribute:"close-label"},options:{type:Array}}}constructor(){super(),this.iconSize=24,this.options=[]}static get styles(){return[A,h("bbva-button-operations-shared-styles"),F.light,F.dark]}render(){return u`
      ${this.closeIcon?u`
            <div class="close-icon">
              <button
                class="icon-item"
                @click="${this._closeClick}"
                aria-labelledby="close-icon-label"
              >
                <span id="close-icon-label" class="sr-only">${this.closeLabel}</span>
                <bbva-core-icon .icon="${this.closeIcon}" .size="${this.iconSize}">
                </bbva-core-icon>
              </button>
            </div>
          `:u``}

      <bbva-header-category text=${this.categoryHeader}></bbva-header-category>

      <div class="buttons">
        ${this.options.map(((t,a)=>u`
            <bbva-button-action
              .icon="${t.icon}"
              .image="${t.image}"
              .imageAltText="${t.imageAltText}"
              .iconSize=${this.iconSize}
              ?disabled=${t.disabled}
              .label="${t.label}"
              @click="${()=>{this._select(a)}}"
            >
            </bbva-button-action>
          `))}
      </div>
    `}_select(t){this.selected=t,this.dispatchEvent(new CustomEvent("button-operations-item-click",{detail:t,bubbles:!0,composed:!0}))}_closeClick(){this.dispatchEvent(new CustomEvent("button-operations-icon-close",{detail:!0,bubbles:!0,composed:!0}))}}export{M as B,F as b};
