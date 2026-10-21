import{z as a,ar as e,a8 as t,a9 as i,b0 as r,b_ as o,bd as n,ab as c,ac as l,ad as s,aa as d,a as h,aS as b,an as g,L as v,bj as y,b$ as p,b6 as m,S as u,aD as $,h as f,ak as k,i as x,av as S,c0 as w,o as _,r as L,g as T}from"./952f98a9.js";import{f as H,e as C,B as P,g as z}from"./b42a85fd.js";var F=a`[ambient^=light] {
  --bbva-header-category-color: initial;
  --bbva-header-category-help-color: initial;
  --bbva-header-category-skeleton-color: initial;
  --bbva-header-category-heading-color: initial;
  --bbva-header-category-amount-date-color: initial;
  --bbva-header-category-amount-color: initial;
}
${(new e).mediaRules()}`;const I=new e;var M=a`[ambient^=dark] {
  --bbva-header-category-color: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
  --bbva-header-category-help-color: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
  --bbva-header-category-skeleton-color: var(--colorsPrimaryMedium, ${t(i.primaryMedium)});
  --bbva-header-category-heading-color: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
  --bbva-header-category-amount-date-color: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
  --bbva-header-category-amount-color: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
}
${I.mediaRules()}`;const W={dark:a`
    ${r.dark}
    ${o.dark}
    ${H.dark}
    ${n.dark}
    ${M} 
  `,light:a`
    ${r.light}
    ${o.light}
    ${H.light}
    ${n.light}
    ${F}
  `},A=new e;var V=a`:host {
  display: flex;
  box-sizing: border-box;
  background-color: var(--bbva-header-category-bg-color, none);
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(d.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(d.spacer)}))) / 15) * 1em);
  position: relative;
  flex-wrap: wrap;
  color: var(--bbva-header-category-dark-mode-color, var(--bbva-header-category-color, var(--colorsSecondary600, ${t(i.secondary600)})));
  font-weight: var(--bbva-header-category-font-weight, var(--fontFacePrimaryMediumFontWeight, ${t(c.medium.fontWeight)}));
  font-style: var(--bbva-header-category-font-style, var(--fontFacePrimaryMediumFontStyle, ${t(c.medium.fontStyle)}));
  font-size: var(--bbva-header-category-font-size, var(--typographyTypeSmall, ${t(l.typeSmall)}));
  line-height: var(--bbva-header-category-line-height, var(--lineHeightTypeSmall, ${t(s.typeSmall)}));
  --_skeleton-color: var(--bbva-header-category-skeleton-dark-mode-color, var(--bbva-header-category-skeleton-color, var(--colorsSecondary200, ${t(i.secondary200)})));
  --_header-category-heading-color: var(--bbva-header-category-heading-dark-mode-color, var(--bbva-header-category-heading-color, var(--colorsSecondary600, ${t(i.secondary600)})));
  --_header-category-amount-color: var(--bbva-header-category-amount-dark-mode-color, var(--bbva-header-category-amount-color, var(--colorsSecondary500, ${t(i.secondary500)})));
  --_header-category-amount-date-color: var(--bbva-header-category-amount-date-dark-mode-color, var(--bbva-header-category-amount-date-color, var(--colorsSecondary600, ${t(i.secondary600)})));
  --_header-category-help-color: var(--bbva-header-category-help-dark-mode-color, var(--bbva-header-category-help-color, var(--colorsPrimaryMedium, ${t(i.primaryMedium)})));
  --_header-category-card-title-color: var(--bbva-header-category-card-title-color, var(--colorsSecondary500, ${t(i.secondary500)}));
  --_header-category-action-bg-color: var(--bbva-header-category-action-bg-color, var(--colorsSecondary100, ${t(i.secondary100)}));
  --_header-category-action-heading-color: var(--bbva-header-category-action-heading-color, var(--colorsSecondary600, ${t(i.secondary600)}));
  --_header-category-action-amount-color: var(--bbva-header-category-action-amount-color, var(--colorsSecondary500, ${t(i.secondary500)}));
  --_header-category-action-help-color: var(--bbva-header-category-action-help-color, var(--colorsPrimaryMedium, ${t(i.primaryMedium)}));
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

[data-tag-name=bbva-core-heading] {
  color: var(--_header-category-heading-color);
}

[data-tag-name=bbva-amount] {
  font-weight: var(--bbva-header-category-amount-font-weight, var(--fontFacePrimaryMediumFontWeight, ${t(c.medium.fontWeight)}));
  color: var(--_header-category-amount-color);
}
:host([variant=date]) [data-tag-name=bbva-amount] {
  font-weight: var(--bbva-header-category-amount-font-weight, var(--fontFacePrimaryBookFontWeight, ${t(c.book.fontWeight)}));
  color: var(--_header-category-amount-date-color);
}

.header-category {
  display: flex;
  position: relative;
  width: 100%;
  justify-content: space-between;
}

:host([loading]) {
  pointer-events: none;
  display: flex;
  flex-flow: column wrap;
  height: 2.5rem;
  justify-content: center;
  align-items: center;
}
:host([loading]) .skeleton {
  width: 100%;
  height: 100%;
  pointer-events: none;
  transition: opacity 0.4s ease-in-out;
  background-repeat: no-repeat;
  opacity: 1;
  background-image: linear-gradient(-60deg, var(--_skeleton-color) 0%, var(--_skeleton-color) 25%, transparent 25%, transparent 65%, var(--_skeleton-color) 65%, var(--_skeleton-color) 100%);
  background-size: 100% 16px;
  background-position: 0 center;
}

:host([hide-padding-top]) {
  padding-top: 0;
}

:host([hide-padding-bottom]) {
  padding-bottom: 0;
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

.header {
  display: flex;
  flex: 1 1 auto;
  overflow: hidden;
  text-transform: uppercase;
  opacity: 1;
}
.header [data-tag-name=bbva-core-heading] {
  display: -webkit-box;
  -webkit-line-clamp: 2;
  -webkit-box-orient: vertical;
  overflow: hidden;
  text-overflow: ellipsis;
  padding-right: var(--bbva-global-spacer, 0.5rem);
}
.header .link {
  color: var(--_header-category-help-color);
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(d.spacer)}))) / 16) * 1em);
}

.options-right {
  align-items: center;
  opacity: 1;
  max-height: var(--bbva-header-category-line-height, var(--lineHeightTypeSmall, ${t(s.typeSmall)}));
  flex-wrap: nowrap;
}
.options-right .link {
  display: flex;
}
.options-right .icon {
  margin-left: var(--bbva-global-spacer, 0.5rem);
}

.badge-variability {
  display: flex;
}
.badge-variability [data-tag-name=bbva-badge-variability] {
  padding-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(d.spacer)}))) / 16) * 1em);
}

:host(.fixed) {
  height: var(--bbva-header-category-height, 3.5rem);
  align-items: center;
}

:host([variant=card]) {
  align-items: flex-end;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(d.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(d.spacer)}))) / 16) * 1em) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(d.spacer)}))) / 16) * 1em);
  font-size: var(--bbva-header-category-card-font-size, var(--typographyTypeXSmall, ${t(l.typeXSmall)}));
  line-height: var(--bbva-header-category-card-line-height, var(--lineHeightTypeSmall, ${t(s.typeSmall)}));
  font-weight: var(--bbva-header-category-card-font-weight, var(--fontFacePrimaryMediumFontWeight, ${t(c.medium.fontWeight)}));
  font-style: var(--bbva-header-category-card-font-style, var(--fontFacePrimaryMediumFontStyle, ${t(c.medium.fontStyle)}));
  color: var(--_header-category-card-title-color);
}
:host([variant=card]) [data-tag-name=bbva-core-heading] {
  display: -webkit-box;
  -webkit-line-clamp: 1;
  -webkit-box-orient: vertical;
  overflow: hidden;
  text-overflow: ellipsis;
}
:host([variant=card]) .secondary-header {
  width: 100%;
}

:host([variant=action]) {
  background-color: var(--_header-category-action-bg-color);
}
:host([variant=action]) [data-tag-name=bbva-core-heading] {
  color: var(--_header-category-action-heading-color);
}
:host([variant=action]) [data-tag-name=bbva-amount] {
  color: var(--_header-category-action-amount-color);
}
:host([variant=action]) .header .link {
  color: var(--_header-category-action-help-color);
}
:host([variant=action])::after {
  position: absolute;
  bottom: 0;
  left: 0;
  width: 100%;
}

:host([amount]:not([variant=date])) [data-tag-name=bbva-core-heading] {
  color: var(--_header-category-amount-color);
}

:host([variant=date]) #heading {
  text-transform: initial;
  font-style: var(--bbva-header-category-date-font-style, var(--fontFacePrimaryMediumItalicFontStyle, ${t(c.mediumItalic.fontStyle)}));
  font-weight: var(--bbva-header-category-date-font-weight, var(--fontFacePrimaryMediumItalicFontWeight, ${t(c.mediumItalic.fontWeight)}));
}

:host([variant=date]:not(.fixed)) {
  align-items: flex-end;
  padding-bottom: 0;
}
${A.mediaRules()}`;class B extends(h(b(g(v)))){static get is(){return"bbva-header-category"}static get scopedElements(){return{"bbva-core-heading":y,"bbva-core-icon":C,"bbva-amount":P,"bbva-badge-notification":p,"bbva-link":m,"bbva-badge-variability":u}}static get properties(){return{accessibilityTextHelp:{type:String,attribute:"accessibility-text-help"},headingLevel:{type:Number,attribute:"heading-level"},text:{type:String},accessibleText:{type:String,attribute:"accessible-text"},optionLink:{type:String,attribute:"option-link"},linkHref:{type:String,attribute:"link-href"},optionIcon:{type:String,attribute:"option-icon"},optionIconAccesibilityText:{type:String,attribute:"option-icon-accesibility-text"},iconHelp:{type:String,attribute:"icon-help"},iconHelpSize:{type:String,attribute:"icon-help-size"},hasHelp:{type:Boolean,attribute:"has-help"},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},notificationType:{type:String,attribute:"notification-type"},notificationAccessibilityText:{type:String,attribute:"notification-accessibility-text"},notifications:{type:Number},loading:{type:Boolean,reflect:!0},variant:{type:String,reflect:!0},notificationsVariant:{type:String,reflect:!0,attribute:"notifications-variant"},linkAccesibilityText:{type:String,attribute:"link-accesibility-text"},status:{type:String},color:{type:String}}}constructor(){super(),this.loading=!1,this.accessibilityTextHelp="bbva-header-category-accessibility-text-help",this.headingLevel=3,this.iconHelp=$(),this.iconHelpSize=24,this.hasHelp=!1,this.color="",this._accessibilityText="bbva-header-category-accessibility-text-"}get _amountAccessibilityText(){return`${this._accessibilityText}${this.status}`}_amountText(){return f`
      ${this.status&&"date"===this.variant?f`
            <span class="sr-only">${this.t(this._amountAccessibilityText)}</span>
            <bbva-badge-variability
              .status=${this.status}
              .color=${this.color}
            ></bbva-badge-variability>
          `:""}
      <bbva-amount
        id="amount"
        ?hidden="${!this.amount}"
        .amount="${this.amount}"
        .currency-code="${this.currencyCode}"
        variant="${"date"===this.variant?"xl":"s"}"
      ></bbva-amount>
    `}get _showLink(){return!(this.notifications||this.optionLink||this.optionIcon)}static get styles(){return[k("bbva-global-dividers-shared-styles"),V,k("bbva-header-category-shared-styles"),W.dark,W.light]}get _ambient(){return"action"===this.variant?"light":void 0}render(){return f`
      <div class="header-category" ?hidden=${this.loading} ambient="${x(this._ambient)}">
        <div class="header">
          <bbva-core-heading id="heading" level="${this.headingLevel}">
            ${this.accessibleText?f`
                  <span aria-hidden="true">${this.t(this.text)}</span>
                  <span class="sr-only">${this.accessibleText}</span>
                `:this.t(this.text)}
          </bbva-core-heading>

          <bbva-core-icon
            id="help"
            @click="${this._helpClickHandler}"
            class="link"
            ?hidden="${!this.hasHelp}"
            role="button"
            aria-label="${this.t(this.accessibilityTextHelp)}"
            .icon="${this.iconHelp}"
            .size="${this.iconHelpSize}"
          >
          </bbva-core-icon>
        </div>

        <div class="options-right ${S({"badge-variability":"date"===this.variant})}">
          ${this.amount&&this.optionLink&&"card"===this.variant?f`
                <bbva-link
                  id="link"
                  class="link"
                  @click="${this._linkClickHandler}"
                  href="${x(this.linkHref)}"
                  ?hidden="${this._showLink}"
                  role="link"
                  aria-label="${x(this.linkAccesibilityText)}"
                >
                  <span id="optionLinkText">${this.t(this.optionLink)}</span>
                  <bbva-core-icon
                    id="optionIcon"
                    icon="${this.optionIcon}"
                    size="${this.iconHelpSize}"
                    class="icon"
                    ?hidden="${!this.optionIcon}"
                  ></bbva-core-icon>
                </bbva-link>
              `:""}
          ${!this.amount||this.optionLink&&"card"===this.variant?"":f` ${this._amountText()} `}
          ${!this.amount&&this.notifications?f`
                <bbva-badge-notification
                  id="badge"
                  class="${x(this.notificationType)}"
                  ?hidden="${!this.notifications}"
                  .accessibilityText="${this.notificationAccessibilityText}"
                  .text="${this.notifications}"
                  .variant="${this.notificationsVariant}"
                ></bbva-badge-notification>
              `:""}
          ${this.amount||this.notifications||!this.optionLink&&!this.optionIcon?"":f`
                <bbva-link
                  id="link"
                  class="link"
                  @click="${this._linkClickHandler}"
                  href="${x(this.linkHref)}"
                  ?hidden="${this._showLink}"
                  aria-label="${x(this.linkAccesibilityText)}"
                  role="link"
                >
                  ${this.optionLink?f` <span id="optionLinkText">${this.t(this.optionLink)}</span> `:f`
                        <span class="sr-only">${this.optionIconAccesibilityText}</span>
                        <bbva-core-icon
                          id="optionIcon"
                          icon="${this.optionIcon}"
                          size="${this.iconHelpSize}"
                          class="icon"
                          ?hidden="${!this.optionIcon}"
                        ></bbva-core-icon>
                      `}
                </bbva-link>
              `}
        </div>
      </div>
      ${this.amount&&this.optionLink&&"card"===this.variant?f` <div class="secondary-right">${this._amountText()}</div> `:""}
      <div class="skeleton"></div>
    `}_helpClickHandler(a){a.preventDefault(),this.dispatchEvent(new CustomEvent("header-category-help-click",{detail:!0,bubbles:!0,composed:!0}))}_linkClickHandler(a){a.preventDefault(),this.dispatchEvent(new CustomEvent("header-category-link-click",{detail:!0,bubbles:!0,composed:!0}))}}T("colors.primaryCoreLightened"),T("colors.primaryCoreLightened"),T("colors.primarySubdued"),T("colors.cool20"),T("colors.primaryCoreLightened"),T("colors.cool50");export{B};
