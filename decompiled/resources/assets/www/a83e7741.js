import{z as t,a8 as i,a9 as e,aa as a,ab as r,ac as n,ad as s,a as o,L as l,ae as c,af as p,ag as g,ah as b,ai as d,aj as m,ak as h,al as v,h as u}from"./952f98a9.js";import{B as y}from"./ca1bc295.js";var S=t`
:host {
  display: block;
  box-sizing: border-box;
  --_panel-operation-background: var(--bbva-panel-operation-background, var(--colorsPrimaryCoreLightened, ${i(e.primaryCoreLightened)}));
  --_panel-operation-text-color: var(--bbva-panel-operation-text-color, var(--colorsSecondary600, ${i(e.secondary600)}));
  --_panel-operation-name: var(--bbva-panel-operation-name, var(--colorsSecondary600, ${i(e.secondary600)}));
  --_panel-operation-icon-color: var(--bbva-panel-operation-icon-color, var(--colorsPrimaryMedium, ${i(e.primaryMedium)}));
  --_panel-operation-icon-color-success: var(--bbva-panel-operation-icon-color-success, var(--colorsTertiaryType6Dark, ${i(e.tertiaryType6Dark)}));
  --_panel-operation-icon-color-error: var(--bbva-panel-operation-icon-color-error, var(--colorsTertiaryType5Medium, ${i(e.tertiaryType5Medium)}));
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

.container {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(a.spacer)}))) / 16) * 1em) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(a.spacer)}))) / 16) * 1em);
  background-color: var(--_panel-operation-background);
}

.content ::slotted(*) {
  color: var(--_panel-operation-text-color);
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${i(r.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${i(r.bookItalic.fontStyle)});
}

[data-tag-name=bbva-clip-product] {
  margin-top: -2rem;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(a.spacer)}))) / 16) * 1rem);
}

.items {
  display: flex;
  width: 100%;
  font-size: var(--typographyTypeSmall, ${i(n.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${i(s.typeSmall)});
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${i(r.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${i(r.bookItalic.fontStyle)});
}

.item {
  width: 50%;
  display: flex;
  flex-direction: column;
}

.item-center {
  display: flex;
  flex-direction: column;
  width: 100%;
  align-items: center;
}

.item-left {
  padding-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(a.spacer)}))) / 16) * 1em);
  align-items: flex-end;
}

.item-right {
  padding-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(a.spacer)}))) / 16) * 1em);
  align-items: flex-start;
}

[data-tag-name=bbva-text] {
  color: var(--_panel-operation-name);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(r.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${i(r.medium.fontStyle)});
  max-width: 100%;
}

.content {
  display: flex;
  align-items: center;
}

[data-tag-name=bbva-clip-entities] {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(a.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-core-icon] {
  color: var(--_panel-operation-icon-color);
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(a.spacer)}))) / 16) * 1rem);
}
:host([status=success]) [data-tag-name=bbva-core-icon] {
  color: var(--_panel-operation-icon-color-success);
}
:host([status=error]) [data-tag-name=bbva-core-icon] {
  color: var(--_panel-operation-icon-color-error);
}
`;class $ extends(o(l)){static get is(){return"bbva-panel-operation"}static get scopedElements(){return{"bbva-clip-entities":c,"bbva-clip-product":y,"bbva-core-icon":p,"bbva-text":g}}static get properties(){return{clipItem:{type:String,attribute:"clip-item"},clipItemRight:{type:String,attribute:"clip-item-right"},clipUserText:{type:String,attribute:"clip-user-text"},clipUserTextRight:{type:String,attribute:"clip-user-text-right"},clipUserImage:{type:String,attribute:"clip-user-image"},clipUserImageRight:{type:String,attribute:"clip-user-image-right"},clipLabel:{type:String,attribute:"clip-label"},hideEllipsis:{type:Boolean,attribute:"hide-ellipsis"},labelLeft:{type:String,attribute:"label-left"},labelRight:{type:String,attribute:"label-right"},status:{type:String,reflect:!0},statusIcon:{type:String,attribute:"status-icon"},statusIcons:{type:Object,attribute:"status-icons"},statusIconSize:{type:String,attribute:"status-icon-size"},originEntity:{type:String,attribute:"origin-entity"},targetEntity:{type:String,attribute:"target-entity"},variantClipProduct:{type:String,attribute:"variant-clip-product"}}}constructor(){super(),this.clipItem="account",this.statusIcon=b(),this.statusIconSize=16,this.originEntity="",this.targetEntity="",this.statusIcons={success:d(),error:m()},this.variantClipProduct="maximum",this.hideEllipsis=!1}static get styles(){return[S,h("bbva-panel-operation-shared-styles"),v.light]}static _tplClipEntity(t){return u`
      <bbva-clip-entities
        ambient="light"
        size="small"
        entity="${t}"
        ?hidden=${!t}
      ></bbva-clip-entities>
    `}get _tplTargetEntity(){return u`
      ${this.targetEntity&&u` ${$._tplClipEntity(this.targetEntity)} `||""}
    `}_getStatus(){return this.status?u`
          <bbva-core-icon
            .icon="${this.statusIcons[this.status]||this.statusIcon}"
            .size="${this.statusIconSize}"
          ></bbva-core-icon>
        `:u` ${this._tplTargetEntity} `}_getClipProduct(){return this.variantClipProduct?u`<div class="item item-left">
        <bbva-text alignment="right" tag="span" .text=${this.labelLeft} .ellipsis=${!this.hideEllipsis}></bbva-text>
          <span class="content">
            ${$._tplClipEntity(this.originEntity)}
            <slot name="left"></slot>
          </span>
        </div>

        <div class="item item-right">
        <bbva-text tag="span" .text=${this.labelRight} .ellipsis=${!this.hideEllipsis}></bbva-text>
          <span class="content">
            ${this._getStatus()}
            <slot name="right"></slot>
          </span>
        </div>
      </div>`:u`
          <div class="item-center">
            <bbva-text
              tag="span"
              .text=${this.labelLeft}
              .ellipsis=${!this.hideEllipsis}
            ></bbva-text>
            <span class="content">
              ${$._tplClipEntity(this.originEntity)}
              <slot name="left"></slot>
            </span>
          </div>
        `}render(){return u`
      <div class="container">
        <bbva-clip-product
          variant="${this.variantClipProduct}"
          .item="${this.clipItem}"
          .userText="${this.clipUserText}"
          .userImage="${this.clipUserImage}"
          .itemRight="${this.clipItemRight}"
          .userTextRight="${this.clipUserTextRight}"
          .userImageRight="${this.clipUserImageRight}"
        >
          ${this.clipLabel}
        </bbva-clip-product>

        <div class="items">${this._getClipProduct()}</div>
      </div>
    `}}export{$ as B};
